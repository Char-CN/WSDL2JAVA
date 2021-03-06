package com.sap.document.sap.soap.functions.mc_style;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import javax.xml.namespace.QName;
import javax.xml.ws.Holder;

/**
 * Please modify this class to meet your needs This class is not complete
 */
import java.io.File;
import java.io.FileWriter;

/**
 * This class was generated by Apache CXF 3.1.6 2016-04-08T14:38:06.585+08:00
 * Generated source version: 3.1.6
 *
 */
public final class ZHRJFPERINTERFACE_Binding_Client {

	private static final QName SERVICE_NAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style", "service");

	private ZHRJFPERINTERFACE_Binding_Client() {
	}

	@SuppressWarnings("resource")
	public static void main(String args[]) throws java.lang.Exception {
		long begin = System.currentTimeMillis();
		String imDate = "2016-04-27";
		String imDays = "1";
		String fName = null;
		if (args.length >= 1) {
			imDate = args[0];
			if (imDate.indexOf("-") == -1) {
				System.out.println("日期格式不对，必须是：yyyy-MM-dd格式.");
				System.exit(-1);
			}
		}
		if (args.length >= 2) {
			imDays = args[1];
		}
		if (args.length >= 3) {
			fName = args[2];
		} else {
			fName = SourceUtil.root + "emp_" + imDate + "_" + imDays + ".csv";
		}

		URL wsdlURL = Service.WSDL_LOCATION;

		Service ss = new Service(wsdlURL, SERVICE_NAME);
		ZHRJFPERINTERFACE port = ss.getBinding();

		// personnel_areas organization secondary_dimension primary_dimension
		HashMap<String, String[]> map = new HashMap<String, String[]>();
		HashMap<String, String> belongToMap = new HashMap<String, String>();
		HashMap<String, String> orgs = new HashMap<String, String>();
		{
			println("开始加载employee.csv...");
			long l1 = System.currentTimeMillis();
			try {
				BufferedReader br = new BufferedReader(new FileReader(SourceUtil.resource + "employee.csv"));
				String s = br.readLine();// 过滤第一条数据
				while ((s = br.readLine()) != null) {
					String[] strs = s.split("\t");
					if (strs.length < 4) {
						throw new Exception("employee.csv error: " + s);
					}
					map.put(strs[0] + strs[1], strs);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			long l2 = System.currentTimeMillis();
			println("加载employee.csv [" + map.size() + "] 条记录,消耗时间:" + (l2 - l1) + "毫秒");
		}
		{
			println("开始加载belong_to.csv...");
			long l1 = System.currentTimeMillis();
			try {
				BufferedReader br = new BufferedReader(new FileReader(SourceUtil.resource + "belong_to.csv"));
				String s = "";
				while ((s = br.readLine()) != null) {
					String[] strs = s.split("\t");
					if (strs.length != 2) {
						throw new Exception("belong_to.csv error: " + s);
					}
					belongToMap.put(strs[0], strs[1]);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			long l2 = System.currentTimeMillis();
			println("belong_to.csv [" + belongToMap.size() + "] 条记录,消耗时间:" + (l2 - l1) + "毫秒");
		}
		{
			println("开始加载orgs.csv...");
			long l1 = System.currentTimeMillis();
			try {
				BufferedReader br = new BufferedReader(new FileReader(SourceUtil.resource + "orgs.csv"));
				String s = "";
				while ((s = br.readLine()) != null) {
					String[] strs = s.split("\t");
					if (strs.length != 2) {
						throw new Exception("orgs.csv error: " + s);
					}
					orgs.put(strs[0], strs[1]);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			long l2 = System.currentTimeMillis();
			println("orgs.csv [" + orgs.size() + "] 条记录,消耗时间:" + (l2 - l1) + "毫秒");
		}

		TableOfZshrJfpernr jfpernr = new TableOfZshrJfpernr();
		Holder<TableOfZshrJfpernr> rst = new Holder<TableOfZshrJfpernr>(jfpernr);
		{
			println("开始调用webservice接口...");
			long l1 = System.currentTimeMillis();
			TableOfZhrsHtPernr htPernr = new TableOfZhrsHtPernr();
			Holder<TableOfZhrsHtPernr> holder = new Holder<TableOfZhrsHtPernr>(htPernr);
			port.zdefmHrJfper(rst, imDate, imDays, holder);

			if (rst == null || rst.value == null || rst.value.item == null) {
				System.err.println("错误 : rst == null");
				System.exit(-1);
			}
			if (rst.value == null) {
				System.err.println("错误 : rst.value == null");
				System.exit(-1);
			}
			if (rst.value.item == null) {
				System.err.println("错误 : rst.value.item == null");
				System.exit(-1);
			}
			if (rst.value.item.size() == 0) {
				System.err.println("错误 : rst.value.item.size() == 0");
				System.exit(-1);
			}
			long l2 = System.currentTimeMillis();
			println("调用接口获取[" + rst.value.item.size() + "]条数据,消耗时间:" + (l2 - l1) + "毫秒");
		}

		File f = new File(fName);
		FileWriter fw = new FileWriter(f);
		{
			println("开始处理每条数据,并且写入文件[" + fName + "]...");
			long l1 = System.currentTimeMillis();
			StringBuilder sb = new StringBuilder();
			int rule1 = 0, rule2 = 0, rule3 = 0, rule4 = 0;

			for (int i = 0; i < rst.value.item.size(); i++) {
				String append1 = "新增_匹配未知";
				String append2 = "新增_匹配未知";

				sb.setLength(0);
				ZshrJfpernr z = rst.value.item.get(i);
				z.clearChar();
				// sb.append(z.toString());
				// 人员编号
				sb.append(z.pernr);
				sb.append(ZshrJfpernr.DILIMITER);
				// 姓名
				sb.append(z.nachn);
				sb.append(ZshrJfpernr.DILIMITER);
				// 人事范围
				sb.append(z.werks);
				sb.append(ZshrJfpernr.DILIMITER);
				// 人事范围文本
				sb.append(z.name1);
				sb.append(ZshrJfpernr.DILIMITER);
				// 组织单位
				sb.append(z.orgeh);
				sb.append(ZshrJfpernr.DILIMITER);
				// 组织单位名称
				sb.append(z.orgtx);
				sb.append(ZshrJfpernr.DILIMITER);
				// IC标识类型 (IC 类型)
				sb.append(z.ictyp);
				sb.append(ZshrJfpernr.DILIMITER);
				// IC标识类型 (IC 类型)
				sb.append(z.ictxt);
				sb.append(ZshrJfpernr.DILIMITER);
				// 标示编号
				sb.append(z.icnum);
				sb.append(ZshrJfpernr.DILIMITER);
				// 手机号
				sb.append(z.zmtel);
				sb.append(ZshrJfpernr.DILIMITER);
				// 邮箱
				sb.append(z.email);
				sb.append(ZshrJfpernr.DILIMITER);
				// 办公电话
				sb.append(z.zotel);
				sb.append(ZshrJfpernr.DILIMITER);
				// EMS号
				sb.append(z.emsid);
				sb.append(ZshrJfpernr.DILIMITER);
				// 雇佣状态
				sb.append(z.stat2);
				sb.append(ZshrJfpernr.DILIMITER);
				// 雇佣状态描述
				sb.append(z.text1);
				if (map.containsKey(z.name1 + z.orgtx)) {
					String[] strs = map.get(z.name1 + z.orgtx);
					append1 = strs[2];
					append2 = strs[3];
					rule1++;
				} else if (z.orgtx.contains("财务")) {
					append1 = "财务中心";
					rule2++;
				} else if (z.orgtx.contains("管理及监察")) {
					append1 = "管理及监察中心";
					rule2++;
				} else if (z.orgtx.contains("档案印章")) {
					append1 = "档案中心";
					rule2++;
				} else if (z.orgtx.contains("监察室")) {
					append1 = "监察中心";
					rule2++;
				} else if (z.orgtx.contains("预决算审计")) {
					append1 = "预决算审计中心";
					rule2++;
				} else if (z.orgtx.contains("售后服务")) {
					append1 = "售后服务中心";
					rule2++;
				} else if (z.orgtx.contains("图纸审查")) {
					append1 = "建筑设计院";
					rule2++;
				} else if (z.orgtx.contains("售后服务")) {
					append1 = "售后服务中心";
					rule2++;
				} else if (belongToMap.containsKey(z.name1)) {
					append1 = belongToMap.get(z.name1);
					rule3++;
				} else {
					append1 = z.name1;
					rule4++;
				}

				append2 = orgs.get(append1);
				if (append2 == null) {
					append2 = "新增_匹配未知";
				}

				sb.append(ZshrJfpernr.DILIMITER);
				sb.append(append1);
				sb.append(ZshrJfpernr.DILIMITER);
				sb.append(append2);

				// // 新增字段
				// sb.append(ZshrJfpernr.DILIMITER);
				// sb.append(z.zmtel);

				sb.append("\n");
				fw.write(sb.toString());
			}
			try {
				fw.flush();
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			long l2 = System.currentTimeMillis();
			println("0   : " + rule1);
			println("1-7 : " + rule2);
			println("备注 : " + rule3);
			println("8   : " + rule4);
			println("处理[" + rst.value.item.size() + "]条数据,消耗时间:" + (l2 - l1) + "毫秒");
		}
		long end = System.currentTimeMillis();
		println("总耗时 : " + (end - begin) + "毫秒");
		System.exit(0);
	}

	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss : ");
	static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS");

	private static String now() {
		return sdf.format(new Date());
	}

	@SuppressWarnings("unused")
	private static String nowFileName() {
		return sdf2.format(new Date());
	}

	private static void println(String... strs) {
		StringBuilder sb = new StringBuilder();
		for (String s : strs) {
			sb.append(s);
		}
		System.out.println(now() + sb);
	}

}
