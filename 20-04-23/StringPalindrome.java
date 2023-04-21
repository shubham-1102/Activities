package string;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println();
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println(str+" is a Palindrome String");
			System.out.println(str+" == "+rev);
		}
		else
		{
			System.out.println(str+" is not a Palindrome String");
			System.out.println(str+" != "+rev);			
		}

	}

}
