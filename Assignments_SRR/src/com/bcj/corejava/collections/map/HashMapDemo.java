package com.bcj.corejava.collections.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Alyssa=22, Char=25, Dan=25, Jeff=20, Kasey=20, Kim=20, Mogran=25,
		// Ryan=25, Stef=22}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Alyssa", 22);
		map.put("Char", 25);
		map.put("Dan", 25);
		map.put("Jeff", 20);
		map.put("Kasey", 20);
		map.put("Kim", 20);
		map.put("Morgran", 25);
		map.put("Ryan", 25);
		map.put("Stef", 22);
		rarest(map);

	}

	private static void rarest(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> frequencies1 = new HashMap<Integer, Integer>();
		// Map<Integer, Integer> frequencies2 = new HashMap<Integer, Integer>();
		for (String key : map.keySet()) {
			if (!frequencies1.containsKey(map.get(key))) {
				frequencies1.put(map.get(key), 1);
				// frequencies1.put(map.get(key),frequencies1.get(map.get(key))+1
		
				// );
			} else {
				frequencies1.put(map.get(key), frequencies1.get(map.get(key)) + 1);
			}
		}
		
	//	getMinKey(frequencies1,);
		
		

		System.out.println(frequencies1);

	}

	
}
