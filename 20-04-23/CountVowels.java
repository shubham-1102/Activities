package string;
import java.util.Scanner;

public class CountVowels {

	public static int countvowels(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a String : ");
          String str = sc.nextLine();
		System.out.println("Number of Vowels in String "+str+" is :"+countvowels(str));

	}

}
