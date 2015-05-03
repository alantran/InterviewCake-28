import java.util.*;


public class Main {

	public static void main(String[] args) {
		String input = "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing." ;
		char[] charArray = input.toCharArray();
		
		int startIndex = 57;
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '(' && i >= startIndex) {
				count++;
			} else if (charArray[i] == ')' && i >= startIndex) {
				count--;
				if (count == 0) {
					System.out.println ("The end index is: " + i);
					return;
				}
			}
			
			//System.out.println(i + " " + charArray[i]);
			
		}

	}

}
