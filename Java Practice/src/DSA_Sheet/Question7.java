package DSA_Sheet;

import java.util.Arrays;

// Array Rotation by 1
// Expected Time Complexity -> O(n)
// Expected Space Complexity -> O(1)

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		
		rotateArrayByOne(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));

	}
	
	public static void rotateArrayByOne(int[] arr, int n) {
		int last = arr[n-1];
        
        for(int i=n-1; i>=1; i--){
            arr[i] = arr[i-1];
        }
        
        arr[0] = last;
	}

}
