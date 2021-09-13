package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
			
		char[] t = test.toCharArray();
		for (int i = 0; i < test.length(); i++) {
			if (Character.isLetter(t[i])) {
				letter++;
			}
			if (Character.isDigit(t[i])) {
				num++;
			}
			if (Character.isSpaceChar(t[i])) {
				space++;
			} else {
				specialChar++;
			}

		}
		System.out.println("Count of letter is:" + letter);
		System.out.println("Count of num is:" + num);
		System.out.println("Count of space is:" + space);
		System.out.println("Count of specialChar is:" + specialChar);

	}
}