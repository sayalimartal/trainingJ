import java.util.*;
class StringRev
{
	public static void main(String args[])
	{
		
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String[] strcopy=str.split(" ");
		int len=strcopy.length;
		for(i=0;i<len;i++)
		{
			StringBuffer s =new StringBuffer(strcopy[i]);
			System.out.print(s.reverse()+" ");
		}
	}
}
		