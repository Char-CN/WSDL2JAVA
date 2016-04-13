package com.sap.document.sap.soap.functions.mc_style;

/**
 * @author Blazer He
 * @date__ 2015年7月24日
 */
public class SysConfig {

	private static Conf conf = null;

	public static boolean test = false;

	public static boolean databaseLogSuccessFlag = true;

	public static boolean databaseLogFailFlag = true;

	public static int noticeFileProcessingMinute = 15;

	public static int logPrintSqlSize = 10;

	static {
		String sysConfPath = SourceUtil.resource + "sys-config.properties";
		conf = ConfUtil.getConf(sysConfPath);
		try {
			test = Boolean.parseBoolean(get("test"));
		} catch (Exception e) {
		}
		try {
			databaseLogSuccessFlag = Boolean.parseBoolean(get("database.log.success.flag"));
		} catch (Exception e) {
		}
		try {
			databaseLogFailFlag = Boolean.parseBoolean(get("database.log.fail.flag"));
		} catch (Exception e) {
		}
		try {
			noticeFileProcessingMinute = Integer.parseInt(get("notice.file.processing.minute"));
		} catch (Exception e) {
		}
		try {
			logPrintSqlSize = Integer.parseInt(get("log.print.sql.size"));
		} catch (Exception e) {
		}
	}

	public static String get(String key) {
		return conf.get(key);
	}

}
