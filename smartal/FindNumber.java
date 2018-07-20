import java.util.*;
class FindNumber
{
	public static void main(String args[])
	{
		int[] array=new int[15];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(i=0;i<15;i++)
			array[i]=sc.nextInt();
		System.out.println("Enter the element to be searched");
		int number=sc.nextInt();
		for(i=0;i<15;i++)
		{
			if(array[i]==number)
			{
				System.out.println("Element "+number+" found at position "+(i+1));
				break;
			}		
		}
	}
}