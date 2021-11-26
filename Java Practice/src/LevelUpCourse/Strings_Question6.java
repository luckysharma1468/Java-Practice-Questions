package LevelUpCourse;


import java.util.*;

// Converting Absolute time in minutes to the format the digital clock supports.

// Sample Input

// 125
// 155
// 1180

// Sample Output
// 2:05
// 2:35
// 19:40

public class Strings_Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		String result = generateDigitalFormat(n);
		
		System.out.println(result);
	}
	
	public static String generateDigitalFormat(int n) {
		
		int hours = n / 60;
		int min = n % 60;
		
		if( hours >= 24) {
			hours -= 24;
		}
		
		String sm = ""+min;
		if(min < 10) {
			sm = "0" + min;
		}
		
		return ("" + hours + ":" + sm);
	}

}
