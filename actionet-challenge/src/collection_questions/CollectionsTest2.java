package collection_questions;

import java.util.*;
import java.util.Map.Entry;

public class CollectionsTest2 {
	/*
	 * A Map is used because maps are objects that map keys to values.
	 * A HashMap is used because neither key order nor insertion order is important 
	 */
	public static Map<String, Integer> map = new HashMap<>();
	
	public static void fillMap() {
		map.put("apples", 1);
		map.put("bananas", 2);
		map.put("carrots", 3);
		map.put("donuts", 4);
		map.put("eggs", 5);
	}
	
	public static void print(Map<String, Integer> map) {
		if (map.size() == 0) return;
		Iterator<Entry<String, Integer>> iter = map.entrySet().iterator();
		Entry<String, Integer> pair = (Entry<String, Integer>) iter.next();
		System.out.print("[" + pair.getKey() + " : " + pair.getValue());
		while (iter.hasNext()) {
			pair = (Entry<String, Integer>) iter.next();
			System.out.print(", " + pair.getKey() + " : " + pair.getValue());
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		// Add 5 key/value pairs into map
		System.out.println("Adding 5 items to map");
		fillMap();
		print(map);
		System.out.println("Size = " + map.size());
		System.out.println();
		
		// Try and add key/value but key is already in map
		// This will not do anything because 'carrot' is already mapped to a value.
		System.out.println("Attempting to add carrots into map again");
		map.putIfAbsent("carrots", 10);
		print(map);
		System.out.println("Size = " + map.size());
		System.out.println();
		
		// This will do something because flour was not in the map.
		System.out.println("Attempting to add flour into map");
		map.putIfAbsent("flour", 6);
		print(map);
		System.out.println("Size = " + map.size());
		System.out.println();

	}

}
