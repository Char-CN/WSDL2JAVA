package com.sap.document.sap.soap.functions.mc_style;

public class A {

	public static void main(String[] args) {
		
		
		String s = "a\nb\tc\r\nasda\nb\tc\r\nasd";
		s = s.replace("\r", "").replace("\n", "").replace("\t", "");
		
		System.out.println(s);
	}

}
