package LevelUpCourse;

import java.util.*;

// Key Sort
// Based on the key sort , sort the strings containing digits 
// lexo graphically or numerically based on the user input.

// Sample Input 

// 3 ---> Number of strings
// 92 022 ----> String containing digits
// 82 12
// 77 13
// 2 false numeric


public class Strings_Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		
		ArrayList<String> array = new ArrayList<>();
		
		while(n > 0) {
			String temp = scan.nextLine();
			array.add(temp);
			n--;
		}
		
		String[] conditions = scan.nextLine().split(" ");
		
		int keyColumn = Integer.valueOf(conditions[0]);
		boolean shouldReverse = Boolean.valueOf(conditions[1]);
		String type = conditions[2];
		
		HashMap<String, String> map = new HashMap<>();
		
		for(int i=0; i<array.size(); i++) {
			String key = array.get(i).split(" ")[keyColumn-1];
			
			map.put(key, array.get(i));
		}
		
//		lexoSort(map);
		ArrayList<String> result;
		if(type.equals("numeric")) {
			 result = numericSort(map);
		}else {
			result = lexoSort(map);
		}
		
		if(shouldReverse) {
			Collections.reverse(result);
		}

		System.out.println(result);
			
	}
	
	public static ArrayList<String> lexoSort(HashMap<String, String> map){
		
		ArrayList<String> result = new ArrayList<>();
		
		TreeMap<String, String> map2 = new TreeMap<>(map);
		for(Iterator it = map2.entrySet().iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry)it.next();
			result.add((String)entry.getValue());
		}
		
		return result;
		
	}
	
	public static ArrayList<String> numericSort(HashMap<String, String> map){
		
		TreeMap<Integer, String> map2 = new TreeMap<>();
		for(Iterator it = map.entrySet().iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry)it.next();
			map2.put(Integer.valueOf((String)entry.getKey()), (String)entry.getValue());
		}
		
		ArrayList<String> result = new ArrayList<>();
		for(Iterator it = map2.entrySet().iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry)it.next();
			result.add((String)entry.getValue());
		}
		
		return result;
	}

}
