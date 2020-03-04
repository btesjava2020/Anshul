package Btes;
import java.lang.reflect.Array;
import java.util.Scanner;
public class linearsearch {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no. to search");
	int n=s.nextInt();
	int arr[]=new int[5];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();                                                    
	}
	for(int i=0;i<arr.length;i++)
	{
		if(n==arr[i]) 
		{
			
		System.out.println("number found at position:" + i);
		break;
	}
		}
}
}