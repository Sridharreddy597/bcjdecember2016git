package com.bcj.corejava.collections.list;

import java.util.ArrayList;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arlist = new ArrayList<String>();
		// "how", "are", "you?", "I", "am", "doing", "fine"
		arlist.add("how");
		arlist.add("are");
		arlist.add("you?");

		reverseList(arlist);

	}

	private static void reverseList(ArrayList<String> arlist) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arlist.size(); i++) {
			String str = new StringBuilder(arlist.get(i)).reverse().toString();
			arlist.set(i, str);
		}

		System.out.println(arlist);
	}

}
