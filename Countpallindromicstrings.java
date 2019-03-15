package Assignment;

import java.util.Scanner;

public class Count_Pallindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
System.out.println(count_pallindrome(str));
	}
	public static boolean  isPallindrome(String str)
	{
		char str2 = 0;
		char str3=0;
		for(int i=str.length()-1,j=0;i>=j;i--,j++)
			
		{
		str2=	str.charAt(i);
		str3=str.charAt(j);
		if(str2!=str3)
			return false;
			}
		return true;
}
	public static int count_pallindrome(String str)
	{
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i;j<=str.length();j++)
			{
				String st=str.substring(i,j);
				if(isPallindrome(st))
					count++;
					
			}
		}
		return count;
	}
}
