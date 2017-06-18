package com.bcj.corejava.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addElements();

	}

	private static void addElements() {
		// TODO Auto-generated method stub
		ArrayList<String> alist = new ArrayList<String>();

		alist.add("pear");
		alist.add("banana");
		alist.add("tangerine");
		alist.add("strawberry");
		alist.add("blackberry");
		usingIterator(alist);

	}

	private static void usingIterator(ArrayList<String> alist) {
		// TODO Auto-generated method stub
		Iterator<String> itr = alist.iterator();

		System.out.println("printing all the elements using iterator");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		usingListIterator(alist);

	}

	private static void usingListIterator(ArrayList<String> alist) {
		// TODO Auto-generated method stub
		ListIterator<String> itr = alist.listIterator();
		while (itr.hasNext()) {
			itr.next();
		}

		System.out.println("printing all the elements using ListIterator");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());

		}
		System.out.println();
		System.out.println("after adding the element bananna ");

		alist.add(3, "banana");
		ListIterator<String> iter = alist.listIterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
