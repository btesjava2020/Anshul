package Btes;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s1=s.nextLine();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2 + s1.charAt(i);
		}
		System.out.println("After string reverse is");
		System.out.println(s2);

	}

}