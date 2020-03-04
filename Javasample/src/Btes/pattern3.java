package Btes;

public class pattern3 {

public static void main(String[] args) {
boolean flag;
	for(int i=1;i<=8;i++)
	{   
	int cnt=1;
		for(int j=1;j<=3*i;j++)
		{
			flag = true;
			for(int k=2;k<j;k++)
			{
				if(j%k==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true && cnt<=i)
			{
				System.out.print(j + " ");
				cnt++;
			}
			
		}
		System.out.println();
	}
	}
	}
		