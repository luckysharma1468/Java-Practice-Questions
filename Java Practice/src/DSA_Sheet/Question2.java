package DSA_Sheet;

public class Question2 {

	// Finding Min and Max in an Array
	// using minimum Comparisons

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 9, 5, 1, 3, 8, 6, 100, -2 };

		linearSearch(arr, arr.length);
		
		Pair minMax = getMinMax(arr, 0, arr.length-1);
		
		System.out.println("Max and Min ELements -> " + minMax.max + " " + minMax.min);
		
		comparePair(arr, arr.length);
	}

	// Linear Search --> O(n), Comparisons = Array Length

	public static void linearSearch(int[] arr, int n) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Max and Min ELements -> " + max + " " + min);
	}

	private static class Pair {
		int min;
		int max;

		Pair() {
			min = Integer.MIN_VALUE;
			max = Integer.MAX_VALUE;
		}
	}

	// Tournament Method Time Complexity --> O(n) , Comparisons --> (3n/2 - 2) when
	// arr.length = Power of 2,
	// else comparisons is more than it.

	public static Pair getMinMax(int[] arr, int low, int high) {
		Pair minMax = new Pair(); // Final Min and Max
		Pair mml = new Pair(); // Left subarray min and max
		Pair mmr = new Pair(); // right subarray min and max

		if (low == high) {
			minMax.min = arr[low];
			minMax.max = arr[high];

			return minMax;
		}

		if (low + 1 == high) {
			if (arr[low] > arr[high]) {
				minMax.max = arr[low];
				minMax.min = arr[high];
			} else {
				minMax.max = arr[high];
				minMax.min = arr[low];
			}

			return minMax;
		}

		int mid = (low + high) / 2;
		mml = getMinMax(arr, low, mid);
		mmr = getMinMax(arr, mid+1, high);
		
		if(mml.min < mmr.min) {
			minMax.min = mml.min;
		}else {
			minMax.min = mmr.min;
		}
		
		if(mml.max > mmr.max) {
			minMax.max = mml.max;
		}else {
			minMax.max = mmr.max;
		}
		
		return minMax;

	}
	
	// Compare in Pairs Time Complexity ---> O(n), Comparisons --> (3n/2 - 2) when
	// arr.length = Power of 2,
	// else comparisons is more than it.
	
	public static void comparePair(int[] arr, int n) {
		
		Pair minMax = new Pair();
		int i = 0; // Counter for Loop
		
		if(n % 2 == 0) {
			if(arr[0] > arr[1]) {
				minMax.max = arr[0];
				minMax.min = arr[1];
			}else {
				minMax.max = arr[1];
				minMax.min = arr[0];
			}
			
			i = 2;
		}else {
			minMax.max = arr[0];
			minMax.min = arr[0];
			
			i = 1;
		}
		
		while(i < n-1) {
			if(arr[i] < arr[i+1]) {
				if(arr[i] < minMax.min) {
					minMax.min = arr[i];
				}
				
				if(arr[i+1] > minMax.max) {
					minMax.max = arr[i+1];
				}
			}else {
				if(arr[i] > minMax.max) {
					minMax.max = arr[i];
				}
				
				if(arr[i+1] < minMax.min) {
					minMax.min = arr[i+1];
				}
			}
			
			i+=2;
		}
	
		System.out.println("Max and Min ELements -> " + minMax.max + " " + minMax.min);
	}

}
