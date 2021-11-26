package LevelUpCourse;

import java.util.Arrays;

// Minimum Difference

// Given two arrays, we have to find the pair one element from each array
// which results into an minimum absolute difference difference.

// Output ---> 17, 19

public class Arrays_Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {23, 5, 10, 17, 30};
		int[] array2 = {26, 134, 135, 14, 19};
		
		// Approach -1 
		// T.C --> O(N2)
		// S.C --> O(1)
		
//		int[] result = approach1(array1, array2, array1.length, array2.length);
		
		
		// Appraoch - 2
		// T.C --> O(NLogN)
		// S.C --> O(1)

		int[] result = approach2(array1, array2, array1.length, array2.length);
		
		for(int i: result) {
			System.out.println(i);
		}
	}
	
	public static int[] approach1(int[] array1, int[] array2, int n, int m) {
		int min = Integer.MAX_VALUE;
		int a = 0;
		int b = 0;
		
		for(int i=0; i<n; i++) {
			int ta = array1[i];
			for(int j=0; j<n; j++) {
				int tb = array2[j];
				
				int temp_min = ta >= tb ? ta - tb : tb - ta;
				
				if(min > temp_min) {
					min = temp_min;
					a = array1[i];
					b = array2[j];
				}
			}
		}
		
		int[] result = new int[2];
		result[0] = a;
		result[1] = b;
		
		return result;
		
	}
	
	public static int[] approach2(int[] array1, int[] array2, int n, int m) {
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		int i = 0;
		int j = 0;
		
		int min = Integer.MAX_VALUE;
		int a = 0;
		int b = 0;
		
		while(i < n && j < m) {
			
			int ta = array1[i];
			int tb = array2[j];
			
			int temp_min = ta >= tb ? ta - tb : tb - ta;
			
			if(min > temp_min) {
				min = temp_min;
				a = array1[i];
				b = array2[j];
			}
			
			if(ta <= tb) {
				i++;
			}else {
				j++;
			}
		}
		
		int[] result = new int[2];
		result[0] = a;
		result[1] = b;
		
		return result;
	}

}
