import java.util.*;
class TotalAvg
{
	public static void main(String args[])
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		int[][] mark=new int[3][3];
		for(i=0;i<3;i++)
		{
			System.out.println("Enter marks for student "+(i+1));
			for(j=0;j<3;j++)
				mark[i][j]=sc.nextInt();
		}
		int[] total={0,0,0};
		float[] avg={0,0,0};
		//total=[0,0,0];
		System.out.print("Total scored in each subject is ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			total[i]+=mark[j][i];
			System.out.print(total[i]+" ");
			avg[i]=total[i]/3;
		}
		System.out.print("\nAverage scored in each subject is ");
		for(i=0;i<3;i++)
			System.out.print(avg[i]+" ");
		int[] totalStudent={0,0,0};
		float[] avgStudent={0,0,0};
		System.out.print("\nTotal scored by each student is ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			totalStudent[i]+=mark[i][j];
			System.out.print(totalStudent[i]+" ");
			avgStudent[i]=totalStudent[i]/3;
		}
		System.out.print("\nAverage scored by each student is ");
		for(i=0;i<3;i++)
			System.out.print(avgStudent[i]+" ");
	}
}
			