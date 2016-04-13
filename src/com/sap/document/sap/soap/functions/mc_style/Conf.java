package com.sap.document.sap.soap.functions.mc_style;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Conf {

	private HashMap<String, String> contentMap = null;

	private List<String> keyList = null;

	private List<String> invalidList = null;

	private Conf(String filePath, String... args) {
		load(filePath, args);
	}

	public static Conf createConf(String filePath, String... args) {
		return new Conf(filePath, args);
	}

	public Set<String> keySet() {
		return contentMap.keySet();
	}

	public List<String> keyList() {
		return keyList;
	}

	public List<String> invalidList() {
		return invalidList;
	}

	public boolean containsKey(String key) {
		return contentMap.containsKey(key);
	}

	public String get(String key) {
		return contentMap.get(key);
	}

	public Conf appendConf(String filePath, String... args) {
		load(filePath, args);
		return this;
	}

	private void load(String filePath, String... args) {
		if (contentMap == null) {
			contentMap = new HashMap<String, String>();
		}
		if (keyList == null) {
			keyList = new ArrayList<String>();
		}
		if (invalidList == null) {
			invalidList = new ArrayList<String>();
		}
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				// 过滤空行
				if (line.equals("")) {
					continue;
				}
				// 过滤注释
				if (line.matches("\\s*[#].*")) {
					continue;
				}
				int eqIndex = line.indexOf("=");
				// 过滤无效行
				if (eqIndex == -1) {
					invalidList.add(line);
					continue;
				}
				String key = line.substring(0, eqIndex).trim();
				String value = line.substring(eqIndex + 1).trim();
				// 替换系统参数
				for (int i = 0; i < args.length; i++) {
					value = value.replace("{" + i + "}", args[i]);
				}
				// 替换当前变量
				for (int i = 0; i < keyList.size(); i++) {
					String k = keyList.get(0);
					value = value.replace("{" + k + "}", contentMap.get(k));
				}
				// 存入list
				if (!contentMap.containsKey(key)) {
					keyList.add(key);
				}
				contentMap.put(key, value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
			}
			try {
				fr.close();
			} catch (IOException e) {
			}
		}
	}

	/**
	 * @return HashMap<String, String>
	 */
	public HashMap<String, String> cloneHashMap() {
		HashMap<String, String> newHashMap = new HashMap<String, String>();
		for (String key : contentMap.keySet()) {
			newHashMap.put(key, contentMap.get(key));
		}
		return newHashMap;
	}

	/**
	 * @return HashMap<String, Object>
	 */
	public HashMap<String, Object> cloneHashMap2() {
		HashMap<String, Object> newHashMap = new HashMap<String, Object>();
		for (String key : contentMap.keySet()) {
			newHashMap.put(key, contentMap.get(key));
		}
		return newHashMap;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (String key : keyList) {
			sb.append(key).append("=").append(contentMap.get(key)).append("\n");
		}
		return sb.toString();
	}

}
