package week2.day1;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Str1 = "madam";
String rev="";
char[] arr = Str1.toCharArray();
System.out.println(arr);
for(int i=arr.length-1;i>=0;i--)
{
	 rev = rev+arr[i];
	
}
if(Str1.equals(rev)) {
	System.out.println("Entered String is a Palindrome String");
}
else {
	System.out.println("Entered String is Not a palindrome String");
}
	}

}
