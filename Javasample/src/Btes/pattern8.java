package Btes;

public class pattern8 {
public static void main(String args[])
{
	for(int i=1;i<=5;i++)
	{
		int alphabet=97;
		for(int j=2;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print((char)alphabet++);
		}
		
	System.out.println();	
	}
}	
}
