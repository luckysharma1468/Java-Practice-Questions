package LevelUpCourse;

// Replacing space in a string with "%20"
// Do this manipulation in place ---> O(1)

public class Strings_Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replace_spaces(new StringBuilder("Hello World,  How are you?"));
	}
	
	public static void replace_spaces(StringBuilder sr) {
		int spaces = 0;
		
		for(int i=0; i<sr.length(); i++) {
			if(sr.charAt(i) == ' ') {
				spaces++;
			}
		}
		
		int idx = sr.length() + 2*spaces;
		int size = idx;
		int oldStringSize = sr.length();
		sr.ensureCapacity(idx);
		
		for(int i=oldStringSize; i<size; i++) {
			sr.append(' ');
		}
		
		
		for(int i=oldStringSize-1; i>=0; i--) {
			if(sr.charAt(i) == ' ') {
				
				sr.setCharAt(idx-1, '0');
				sr.setCharAt(idx-2, '2');
				sr.setCharAt(idx-3, '%');
				
				idx -= 3;
			}
			else {
				sr.setCharAt(idx-1, sr.charAt(i));
				idx--;
			}
		}
		
		System.out.println(sr);
	}

}
