package com.bcj.javacertification.collection;

import java.util.ArrayList;
import java.util.List;

public class Listconcept {
	public static void main(String[] args) {
		List<String> names	= new ArrayList<String>();
		names.add("robb");
		names.add("Bran");
		names.add("rick");
		names.add("Bran");
		if(names.remove("Bran"))
			names.remove("Jon");
		System.out.println(names);
		
	}

}
