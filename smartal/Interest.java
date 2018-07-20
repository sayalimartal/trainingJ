import java.util.*;
class Interest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle amount, time period and rate of interest"); 
		double p=sc.nextDouble();
		double n=sc.nextDouble();
		double r=sc.nextDouble();
		double si=(p*n*r)/100;
		double ci=(p*Math.pow(1+(r/100),n))-p;
		System.out.println("Simple interest is "+si);
		System.out.println("Compound interest is "+ci);
	}
}