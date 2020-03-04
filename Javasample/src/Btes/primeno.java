package Btes;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the number to check prime no:");
		int n=s.nextInt();
		for(int i=2;i<=(n/2);i++)
		{
		if(n/i==0)
		{
			count++;
			break;
		}
		}
		if(count==1)
		{
			System.out.println("Prime no.");
		}
		else
		{
			System.out.println("not prime no ");
		}
		}
	}

