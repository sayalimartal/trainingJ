import java.util.*;
class ArmsRange
{
	public static void main(String args[])
	{
		int rem,sum=0,n;
		System.out.println("Armstrong numbers from 100 to 999 are");
		for(int n1=100;n1<1000;n1++)
		{
				sum=0;
				n=n1;
				while(n>0)
				{
					rem=n%10;
					sum=sum+(rem*rem*rem);
					n=n/10;
				}
				if(n1==sum)
				System.out.print(n1+" ");
		}
	}
}