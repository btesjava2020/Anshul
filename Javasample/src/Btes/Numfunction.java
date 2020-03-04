package Btes;

public class Numfunction {
	public static void CheckNums(int num1,int num2) {
		if(num1>num2)
		{
			System.out.println("True");
		}
		else if(num1<num2)
		{
			System.out.println("False");
		}
		else
		{
			System.out.println("-1");
		}
		
	}
	public static void main(String args[])
	{
		int x=10,y=10;
		CheckNums(x,y);
		
	}
}
