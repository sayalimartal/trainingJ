import java.util.*;
public class SortPalindrome {
public static void main(String args[])
{
	int i;
	int[] len=new int[10];
	String[] str=new String[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 10 strings");
	for(i=0;i<10;i++)
	str[i]=sc.nextLine();
	for(i=0;i<10;i++)
	{
		StringBuffer strcopy =new StringBuffer(str[i]);
		StringBuffer strrev=strcopy.reverse();
		if(strrev.equals(strcopy))
			len[i]=strcopy.length();
		System.out.println(len[i]);
	}
}
}

