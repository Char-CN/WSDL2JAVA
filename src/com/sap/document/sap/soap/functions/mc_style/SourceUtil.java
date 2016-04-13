package com.sap.document.sap.soap.functions.mc_style;

import java.io.File;

public class SourceUtil {

	public static String root = System.getProperty("user.dir");

	public static String resource = System.getProperty("user.dir");

	static {
		root = SourceUtil.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		root = root.substring(0, root.lastIndexOf("/"));
		// filter in the eclipse have /bin folder
		if (root.lastIndexOf("/bin") > -1) {
			root = root.substring(0, root.lastIndexOf("/bin"));
		}
		File file = new File(root);
		root = file.getAbsolutePath().replace("\\", "/") + "/";
		resource = root + "resource/";
	}

}
