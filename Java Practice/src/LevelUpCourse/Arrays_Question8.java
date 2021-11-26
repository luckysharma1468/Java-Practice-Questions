package LevelUpCourse;

// Maximum Sub array

// Correct Output for below case is - 13

public class Arrays_Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Brute Force approach
		// T.C -> O(n2)
		// S.C -> O(1)
		
		int[] arr = {-1, 2, 3, 4, -2, 6, -8, 3};
		
//		int result = approach1(arr, arr.length);
//		
//		System.out.println(result);
		
		
		// Kadane Algorithm
		// T.C -> O(N)
		// S.C -> O(1)
		int result = approach2(arr, arr.length);
		
		System.out.println(result);
	}
	
	public static int approach1(int[] arr, int n) {
		int max = 0;
		
		for(int i=0; i<n; i++) {
			int temp_sum = 0;
			
			for(int j=i; j<n; j++) {
				
				temp_sum += arr[j];
				
				if(max < temp_sum) {
					max = temp_sum;
				}
				
				if(temp_sum < 0 ) {
					temp_sum = 0;
				}
			}
		}
		
		return max;
	}
	
	public static int approach2(int[] arr, int n) {
		int max = 0;
		
		int i = 0;
		int curr_sum_so_far = 0;
		
		for(i = 0; i< n; i++) {
				
			curr_sum_so_far += arr[i];
			
			if(curr_sum_so_far < 0 ) {
				curr_sum_so_far = 0;
			}
		
			if(max < curr_sum_so_far) {
				max = curr_sum_so_far;
			}
			
		}
		
		return max;
	}

}
