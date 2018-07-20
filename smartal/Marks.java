import java.util.*;
class Marks
{
	public static void main(String args[])
	{
		int m1,m2,m3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks for three subjects");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		System.out.print("Result is ");
		if(m1>=60 && m2>=60 && m3>=60)
		System.out.println("Passed");
		else if((m1>=60 && m2>=60 && m3<60) || (m1>=60 && m3>=60 && m2<60) || (m2>=60 && m3>=60 && m1<60))
		System.out.println("Promoted");
		else
		System.out.println("Failed");
	}
}
	
		