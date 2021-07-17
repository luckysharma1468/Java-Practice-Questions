package DSA_Sheet;

// Kadane Algorithm

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,-2,5};
		int n = arr.length;
		
		System.out.println(maximumSubarray(arr, n));

	}
	
	public static int maximumSubarray(int[] arr, int n) {
		 int max_sum = Integer.MIN_VALUE;
	        int curr_sum_so_far = 0;
	        
	        for(int i=0; i<n; i++){
	            curr_sum_so_far += arr[i];
	            
	            
	            if(curr_sum_so_far > max_sum){
	                max_sum = curr_sum_so_far;
	            }
	            
	            if(curr_sum_so_far < 0){
	                curr_sum_so_far = 0;
	            }
	            
	        }
	        
	        return max_sum;
	}

}
