package Btes;

public class pattern9  {
	public static void main(String args[])
	{
		 int c=1,k,i,j;
		    for(i=0;i<=5;i++)
		    {
		        for(k=0;k<=5-i;k++)
		        System.out.print(" ");
		        for(j=0;j<=i;j++)
		        {
		            if (j==0||i==0)
		                c=1;
		            else
		               c=c*(i-j+1)/j;
		            System.out.print(" "+c);
		        }
		        System.out.print("\n");
		    }
		}
	
		
	} 


