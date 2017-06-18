package com.bcj.corejava.collections.comparator;

import java.util.*;

class BackwardOrdering implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer) arg0;
		Integer i2 = (Integer) arg1;
		return i2.compareTo(i1);
	}

}

class AlternatingOrdering implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i2 <= 0)
			return i2.compareTo(i1);
		else
			return i1.compareTo(i2);

	}

}

class Sorting {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int listSize = 30;
		int magnitude = 500;
		Random rand = new Random(12345);

		ArrayList<Integer> numbers = new ArrayList<Integer>(listSize);
		for (int i = 0; i < listSize; i++) {
			numbers.add(rand.nextInt() % magnitude);
		}

		Collections.sort(numbers, new BackwardOrdering());
		System.out.println("BackwardOrdering ......");

		for (Integer num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		System.out.println("AlternatingOrdering ......");

		Collections.sort(numbers, new AlternatingOrdering());
		for (Integer num : numbers) {
			System.out.print(num + " ");
		}
	}
}