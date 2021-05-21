package Generics;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Integer[] arri = { 10, 20, 30, 40 };

		String[] arrs = { "Hello", "Prashant", "Sharma" };

//		display(arri);
//		display(arrs);

		car[] cars = new car[3];
		cars[0] = new car(40, 1000, "Yellow");
		cars[1] = new car(10, 2000, "Red");
		cars[2] = new car(60, 500, "Green");

		bubbleSort(cars, new carSpeedComparator());
		display(cars);

	}

	public static <T> void display(T[] arr) {
		for (T val : arr) {
			System.out.println(val);
		}

//		System.out.println();
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	public static <T> void bubbleSort(T[] arr, Comparator<T> comp) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length - 1 - i; j++) {
				if (comp.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
