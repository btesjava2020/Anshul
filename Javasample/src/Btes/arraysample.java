package Btes;

import java.lang.reflect.Array;
import java.util.Scanner;

public class arraysample {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
	}
	for(int j=0;j<arr.length;j++)
	{
		System.out.println(arr[j]);
	}
}
}