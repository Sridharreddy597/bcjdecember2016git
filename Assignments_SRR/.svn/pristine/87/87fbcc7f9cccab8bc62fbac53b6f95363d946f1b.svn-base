package com.bcj.corejava.collections.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo2 {

	public static boolean ASC = true;
	public static boolean DESC = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("John", "Dallas");
		map.put("Babbar", "NewYork City");
		map.put("Akbar", "Houston");
		map.put("Rizwan", "Dallas");
		map.put("Jorge", "Paris");
		map.put("Roshan", "Dallas");
		map.put("Sujit", "Houston");

		cityCount(map);

	}

	private static void cityCount(HashMap<String, String> map) {
		// TODO Auto-generated method stub

		Map<String, Integer> frequencies = new HashMap<String, Integer>();
		// Map<Integer, Integer> frequencies2 = new HashMap<Integer, Integer>();
		for (String city : map.keySet()) {
			if (!frequencies.containsKey(map.get(city))) {
				frequencies.put(map.get(city), 1);
				// frequencies1.put(map.get(key),frequencies1.get(map.get(key))+1
				// );
			} else {
				frequencies.put(map.get(city), frequencies.get(map.get(city)) + 1);
			}
		}

		System.out.println("After sorting descindeng order......");
		Map<String, Integer> sortedMapDesc = sortByComparator(frequencies, DESC);
		printMap(sortedMapDesc);

	}

	public static void printMap(Map<String, Integer> map) {
		System.out.println("key  \t" + "\t" + "value");
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "\t" + "\t" + +entry.getValue());
		}
	}

	private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap, final boolean order) {

		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());

		// Sorting the list based on values
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if (order) {
					return o1.getValue().compareTo(o2.getValue());
				} else {
					return o2.getValue().compareTo(o1.getValue());

				}
			}
		});

		// Maintaining insertion order with the help of LinkedList
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

}
