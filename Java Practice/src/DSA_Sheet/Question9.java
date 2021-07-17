package DSA_Sheet;

//Minimum Jump Required to reach end of the array

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		
//		int arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		System.out.println(minJumps(arr, arr.length));

	}
	
	public static int minJumps(int[] arr, int n) {
		int jumps = 0;
		int i =0;
		int last = arr.length -1;
		
		while(i < arr.length) {
			if(arr[i] == 0) {
				return -1;
			}
			
			System.out.println(i);
			
			if((i + arr[i]) >= last) {
				jumps++;
				return jumps;
			}else {
				int maxIndex = 0;
				int temp = Integer.MIN_VALUE;
				
				for(int j=0; j< arr[i]; j++) {
					
					if(arr[j] == 0) {
						return -1;
					}
					
					if(j+i<arr.length && temp <= arr[j+i]) {
						temp = arr[j+i];
						maxIndex = j+1;
					}
				}
				
				
				jumps++;
				i = i+ maxIndex;
			}
		}
		
		return jumps;
	}

}
