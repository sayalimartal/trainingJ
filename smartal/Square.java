import java.util.*;
class Square
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int i=sc.nextInt();
		int s=sq(i);
		System.out.println(i+"*1="+i+", Square:"+s);
	}
	public static int sq(int i)
	{
		int s=i*i;
		return s;
	}
}