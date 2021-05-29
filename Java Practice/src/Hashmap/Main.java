package Hashmap;

import java.util.*;
public class Main {

	public static int highestFrequeny(int[] arr, int n){
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i=0; i<n; i++){
			int key = arr[i];

			if(map.containsKey(key)){
				int value = map.get(key);
				map.put(key, value+1);
			}else{
				map.put(key, 1);
			}
		}

		int max = Integer.MIN_VALUE;
		int key = 0;

		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

		for(Map.Entry<Integer, Integer> entry: entries){
			if(entry.getValue() > max){
				max = entry.getValue();
				key = entry.getKey();
			}
		}

		return key;
	}

    public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
		}

		System.out.println(highestFrequeny(arr, n));

    }
}