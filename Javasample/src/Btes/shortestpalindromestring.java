package Btes;

import java.util.Scanner;

public class shortestpalindromestring {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of palindrom's");
		int n=s.nextInt();
		String s1[]=new String[10];
		System.out.println("Enter the string");
		for(int i=0;i<n;i++)
		{
			s1[i]=s.next();
		}
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2 + s1.charAt(i);
		}
		if(s1.equals(s2))
		{
		int s3=s2.length();
		if()
		}
	}
}
