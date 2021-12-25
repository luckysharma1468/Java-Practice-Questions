import java.util.*;


public class Searching_Question6{

	public static void lower_bound(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
		Collections.sort(arr2);
		int p1 = -1, p2 = -1;
		int diff = Integer.MAX_VALUE;

		for(int x: arr1){
			int lb = Collections.binarySearch(arr2, x) - arr2.get(0);

			// left
			if(lb>= 1 && x - arr2.get(lb-1) < diff){
				diff = x - arr2.get(lb-1);
				p2 = x;
				p1 = arr2.get(lb);
			}

			// right
			System.out.println(lb + " " + arr2);
			if(lb != arr2.size() && arr2.get(lb) - x < diff){
				diff = arr2.get(lb) - x;
				p1 = x;
				p2 = arr2.get(lb);
			}
		}

		System.out.println("Min Pair" + p1 + " " + p2);
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(-1, 5, 10, 20, 3));
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(26, 134, 135, 15, 17));

		lower_bound(arr1, arr2);
	}
}