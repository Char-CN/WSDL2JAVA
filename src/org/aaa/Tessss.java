package org.aaa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.blazer.util.FEach;
import org.blazer.util.FReader;

import com.sap.document.sap.soap.functions.mc_style.SourceUtil;

public class Tessss {


	public static void main(String[] args) throws IOException {

		List<String> list = new ArrayList<>();
		new FReader(SourceUtil.resource + "orgs.csv").each(new FEach() {
			@Override
			public void handle(String row) throws IOException {
				// System.out.println("in ~~~");
				list.add(row);
				System.out.println(row);
				// System.out.println("out ~~");
			}
		});
		System.out.println(list.size());
	}

}
