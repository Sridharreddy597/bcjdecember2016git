package com.bcj.corejava.collections.set;


import java.util.*;

/**
 * @author Bootcamp User 005
 *this class is decribes the usage of set interface and its methods
 */
public class SetDemo {

	public static void main(String[] args) {

		// Create a set called mySet
		Set<String> mySet = new HashSet();

		// Ensure that this set contains an interesting selection of fruit
		String fruit1 = "pear", fruit2 = "banana", fruit3 = "tangerine", fruit4 = "strawberry", fruit5 = "blackberry";
		mySet.add(fruit1);
		mySet.add(fruit2);
		mySet.add(fruit3);
		mySet.add(fruit2);
		mySet.add(fruit4);
		mySet.add(fruit5);

		// Display contents of mySet
		System.out.println("mySet now contains:");
		System.out.println(mySet);
		System.out.println("the cardinality of mySet is :" + mySet.size());
		Iterator<String> itr = mySet.iterator();
		while (itr.hasNext()) {
			// remove the blackberry and strawberry;
			String obj = itr.next();
			if (obj.equals("blackberry") || obj.equals("strawberry"))
				itr.remove();
		}
		System.out.println(mySet);

		Iterator<String> iter = mySet.iterator();
		while (iter.hasNext()) {
			// remove the blackberry and strawberry;
			String obj = iter.next();

			iter.remove();
		}
		System.out.println(mySet);
		System.out.println("The myset is empty : " + mySet.isEmpty());

	}
}
