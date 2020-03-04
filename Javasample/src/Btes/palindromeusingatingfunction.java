package Btes;

public class palindromeusingatingfunction {
public static void main(String args[]) {
	StringBuffer sb=new StringBuffer("one");
	StringBuffer s=new StringBuffer(sb);
if(s.toString().equals(sb.reverse().toString()))
	
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
