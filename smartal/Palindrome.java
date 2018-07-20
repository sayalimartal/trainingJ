import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		int number,rev=0,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		int copy=number;
		while(number>0)
		{
			d=number%10;
			rev=(rev*10)+d;
			number=number/10;
		}
		if(copy==rev)
		System.out.println("true");
		else
		System.out.println("false");
	}
}