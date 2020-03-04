package Btes;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		int i,j,temp;
		int []ar=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements to be sort");
		for(int k=0;k<ar.length;k++)
		{
		 ar[k]=s.nextInt();
		}
		for(i=0;i<ar.length-1;i++)
		{
			for(j=0;j<ar.length-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array is");
for(int m=0;m<ar.length;m++)
{
	System.out.println(ar[m]);
}
	}

}
