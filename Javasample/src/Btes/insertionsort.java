package Btes;

import java.util.Scanner;

public class insertionsort {

	public static void main(String[] args) {
		int i,j,temp;
		Scanner s=new Scanner(System.in);
		int []arr=new int[5];
		for(j=0;j<arr.length;j++)
		{
			System.out.println("Enter the no.");
			arr[j]=s.nextInt();
			for(i=0;i<arr.length-1;i++)
			{
				if(arr[j]>arr[i])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		System.out.println("Enter the sorted array = " + arr[j]);
		}

	}

}
