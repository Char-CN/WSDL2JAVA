package org.blazer.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.sap.document.sap.soap.functions.mc_style.SourceUtil;

public class Test {

	public static void main(String[] args) throws IOException {

		List<String> list = new ArrayList<>();
		new FReader(SourceUtil.resource + "orgs.csv").each(new FEach() {
			@Override
			public void handle(String row) throws IOException {
				// System.out.println("in ~~~");
				// while (my.hasNext()) {
				// list.add(my.next());
				// System.out.println(my.toString() + list.size());
				// }
				list.add(row);
				System.out.println(row);
				// System.out.println("out ~~");
			}
		});
		System.out.println(list.size());
	}

}

