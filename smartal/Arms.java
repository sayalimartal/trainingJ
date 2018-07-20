import java.util.*;
class Arms
{
	public static void main(String args[])
	{
		int n,rem,sum=0,n1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		n1=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(n1==sum)
		System.out.println("Armstrong number");
		else
		System.out.println("Not an Armstrong number");	
	}
}