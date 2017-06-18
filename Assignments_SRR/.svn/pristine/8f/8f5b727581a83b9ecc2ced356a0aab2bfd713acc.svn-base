package com.bcj.corejava.collections.list;

import java.util.ArrayList;

import java.util.Collections;

public class ListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arlist = new ArrayList<String>();
		// "how", "are", "you?", "I", "am", "doing", "fine"
		arlist.add("how");
		arlist.add("are");
		arlist.add("you?");
		arlist.add("I");
		arlist.add("am");
		arlist.add("doing");
		arlist.add("fine");
		reverseOddAndEvenList(arlist);

	}

	private static void reverseOddAndEvenList(ArrayList<String> arlist) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arlist.size() - 1; i = i + 2) {
			Collections.swap(arlist, i, i + 1);

		}
		// "are", "how", "I", "you?", "doing", "am", "fine"
		System.out.println(arlist);
	}

}
