package com.bcj.corejava.collections.set;

import java.util.*;

public class UniqueAndDuplicates {

	public static void main(String[] args) {

		int count1[] = { 3, 7, 3, -1, 2, 3, 7, 2, 15, 15 };
		Set<Integer> set1 = new HashSet<Integer>();

		for (int i = 0; i < count1.length; i++) {
			set1.add(count1[i]);

		}

		int count2[] = { -5, 15, 2, -1, 7, 15, 36 };
		Set<Integer> set2 = new HashSet<Integer>();

		for (int i = 0; i < count2.length; i++) {
			set2.add(count2[i]);
		}
		countCommon(set1, set2);
	}

	private static void countCommon(Set<Integer> set1, Set<Integer> set2) {
		// TODO Auto-generated method stub

		set1.retainAll(set2);

		System.out.println(set1);
		System.out.println("size is  :" + set1.size());

	}

}
