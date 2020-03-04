package Btes;

public class ages {
public static void main(String args[])
{
	int n=10;
	if(n>=80)
	{
		System.out.println("Excellent");
	}
	else if(n>=70 && n<80)
	{
		System.out.println("Very good");
	}
	else if(n>=50 && n<70)
	{
		System.out.println("Good");
	}
	else if(n>=40 && n<50)
	{
		System.out.println("Average");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
