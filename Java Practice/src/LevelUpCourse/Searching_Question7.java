import java.util.*;

// Angry Birds

// Given N nests at different positions, we have to find the largest minimum distance where
// we can put birds in Nests. we can only place one bird in one nest.
// B<=N
// Sample Input 

// Nests Position -> {1, 2, 4, 8, 9}; (It can be unsorted)

// Nests -> 5

// Birds to Place -> 3

// Sample Output

// 3

// Idea

// we will apply binary search on the maximum possible distance.

// maximum possibe distance in our case will be between two birds will be 
// Delta -> (last nest position) - (first nest position)

// then our search space become --> 0 to delta 

// for every mid point we will check whether we can place our birds atleast with this separation(mid)
// or not ?

// if we can place search its right place

// else search left space

// Time complexity for this will be ---> O(NLog(Delta)) 



public class Searching_Question7{

	public static boolean canPlaceBirds(int totalBirds, int nests, int[] nestsPositions, int sep){
		int birds = 1;
		int lastLocation = nestsPositions[0];

		for(int i=1; i<nests; i++){
			int currentLocation = nestsPositions[i];
			if(currentLocation - lastLocation >= sep){
				birds++;
				lastLocation = currentLocation;

				if(birds == totalBirds){
					return true;
				}
			}
		}

		return false;
	}

	public static int largestMinimumDifference(int[] nestsPositions, int nests, int totalBirds){
		int start = 0;
		int end = nestsPositions[nests-1] - nestsPositions[0]; // Largest Minimum distance 
															   //where we can place two birds
		int ans = -1;
		// Binary Search
		while(start <= end){
			int mid = (start + end)/2;

			boolean canPlace = canPlaceBirds(totalBirds, nests, nestsPositions, mid);

			if(canPlace){
				ans = mid;
				start = mid+1;
			}
			else{
				end = mid -1;
			}
		}

		return ans;
	} 

	public static void main(String[] args) {
		int[] nestsPositions = {1, 2, 4, 8, 9};
		int nests = nestsPositions.length;
		int totalBirds = 3;		
		Arrays.sort(nestsPositions);
		int result = largestMinimumDifference(nestsPositions, nests, totalBirds);
		System.out.println(result);
	}
}