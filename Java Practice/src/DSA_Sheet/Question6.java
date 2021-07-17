package DSA_Sheet;

// Union and Intersection of two sorted arrays

//  Output -> Length of union array (Only Distinct elements no repetition)

// Expected Time Complexity -> O(n+m)

// Expected Space Complexity -> O(1)

public class Question6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,  3, 4, 5, 7};
		int arr2[] = {2, 3, 5, 6};
		
		System.out.println(mergingUnion(arr1, arr2, arr1.length, arr2.length));
		
		System.out.println(mergingIntersection(arr1, arr2, arr1.length, arr2.length));
	}
	
	// Using Merging
	// Time Complexity -> O(n+m)
	
	public static int mergingUnion(int[] arr, int[] brr, int m , int n) {
		int index = 0;
		
		int i=0, j = 0;
		
		while(i< m && j <n) {
			if(arr[i] < brr[j]) {
				i++;
		
			}else if(arr[i] > brr[j]) {
		
				j++;
			}else {
				i++;
				j++;
			}
			
			index++;
		}
		
		
		while(i < m ) {
			index++;
			i++;
		}
		
		while(j < n) {
			index++;
			j++;
		}
		
		return index;
	}
	
	public static int mergingIntersection(int[] arr, int[] brr, int m, int n) {
		int index = 0;
		
		int i=0, j = 0;
		
		while(i< m && j <n) {
			if(arr[i] < brr[j]) {
				i++;
		
			}else if(arr[i] > brr[j]) {
		
				j++;
			}else {
				index++;
				i++;
				j++;
			}
			
		
		}
		
		
		
		return index;
	}
	
	// Handling Duplicates
	
	public static int UnionWithDuplicatesInSortedArray(int[] arr, int[] brr) {
		 int ans = 0;
	        int index = 1;
	        
	        int ma = arr[arr.length - 1];
	        int mb = brr[brr.length - 1];
	        
	        if(ma > mb){
	            ans = ma;
	        }else{
	            ans = mb;
	        }
	        
	      
	        
	        int[] newTable = new int[ans+1];
	        
	        ++newTable[arr[0]];
	        
	        for(int i=1; i<arr.length; i++){
	            if(arr[i] != arr[i-1]){
	                index++;
	                ++newTable[arr[i]];
	            }
	        }
	        
	        for(int j=0; j< brr.length; j++){
	            if(newTable[brr[j]] == 0){
	                index++;
	                ++newTable[brr[j]];
	            }
	        }
	        
	        return index;
	}
	

}
