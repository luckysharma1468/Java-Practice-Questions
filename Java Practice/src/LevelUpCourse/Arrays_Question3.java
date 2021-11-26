package LevelUpCourse;

import java.util.*;

// Important Trick -> Find out the peaks 
// Peaks -> arr[i-1] < arr[i] && arr[i] > arr[i+1]
// means previous and next element is smaller than the current element

// Just Iterate backwards from peak until we found the element which is not decreasing 
// (means it is started increasing) <--- Its count will be X
// Just Iterate forward from peak until we found the element which is not increasing 
// (means it is started decreasing) <--- Its count will be Y

// X + Y = Highest Mountain Peak (Diameter of longest increasing and decreasing subarray) 

// Question -> Given an integer array of Distinct Numbers, we have to find the length of the highest Mountain
// Mountain can be made by atleast 3 numbers.

// Output is 9 for below test case.

public class Arrays_Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5, 6, 1, 2, 3, 4, 5, 4, 3, 2, 0, 1, 2, 3, -2, 4};
		
		// T.C -> O(N)
		// S.C -> length of storing peak Indexes.
		
		System.out.println(HighestMountain(arr));
	}
	
	public static ArrayList<Integer> peaks(int[] arr){
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			
			if(i == 0) {
				if(arr[i] > arr[i+1]) {
					result.add(i);
				}
			}
			else if (i == arr.length-1) {
				if(arr[i] > arr[i-1]) {
					result.add(i);
				}
			}
			else {
				if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
					result.add(i);
				}
			}
		}
		
		return result;
	}
	
	public static int HighestMountain(int[] arr) {
		ArrayList<Integer> peakIndexes = peaks(arr);
		
		
		int maxDiameter = Integer.MIN_VALUE;
		
		for(Integer i: peakIndexes) {
			int j = i;
			int k = i+1;
			
			int countX = 1;
			
			while(j > 0 && arr[j] > arr[j-1]) {
				countX++;
				j--;
			}
			
			
			int countY = 1;
			
			while(k < arr.length -1 && arr[k] > arr[k+1]) {
				countY++;
				k++;
			}
			
			int Diameter = countX + countY;
			
			if(maxDiameter < Diameter) {
				maxDiameter = Diameter;
			}
		}
		
		return maxDiameter;
	}

}
