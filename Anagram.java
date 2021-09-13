package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t1 = "stops", t2 = "potss";
		if((t1.length())==(t2.length())) {
			System.out.println("Entered word has same length");
			char[] a1= t1.toCharArray();
			char[] a2= t2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			boolean equals = Arrays.equals(a1, a2);
			if(equals) {
				System.out.println("Entered texts are anagram texts");
			}
			else {
				System.out.println("Entered texts are not anagram texts");
			}
		}
	}

}
