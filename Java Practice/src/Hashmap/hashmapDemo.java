package Hashmap;

import java.util.*;

public class hashmapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("India", 1000);
		map.put("China", 500);
		map.put("USA", 900);
		map.put("Ukraine", 700);
		
		System.out.println(map.get("India"));
		
		System.out.println(map.remove("China"));
		
		System.out.println(map.remove("China"));
		
		map.put("Latina", 800);
		
		Set<String> keys = map.keySet();
		
		System.out.println(keys);
		
		Collection<Integer> values = map.values();
		
		System.out.println(values);
		
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		System.out.println(entries);
		
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		
		String str = "aabbaaabcdda";
		
		System.out.println(getMaxCharacter(str));
	}
	
	public static char getMaxCharacter(String str) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			
			char cc = str.charAt(i);
			
			if(map.containsKey(cc)) {
				int ov = map.get(cc);
				map.put(cc, ov+1);
			}else {
				map.put(cc, 1);
			}
		}
		
		char mc = '\0';
		int max = 0;
		
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		
		for(Map.Entry<Character, Integer> entry: entries) {
			if(entry.getValue() > max) {
				max = entry.getValue();
				mc = entry.getKey();
			}
		}
		
		return mc;
	}

}
