import java.util.*;
class Login
{
	public static void main(String args[])
	{
		int flag=0,count=0;
		Scanner sc=new Scanner(System.in);
		while(flag==0)
		{
			System.out.println("Enter the login name and password");
			String loginName=sc.nextLine();
			String password=sc.nextLine();
			if(loginName.equals("sayali") && password.equals("say@123"))
			{
				System.out.println("Welcome "+loginName);
				flag=1;
				break;
			}
			else
				count++;
			if(count==3)
			{
				System.out.println("Contact Admin");
				break;
			}
		}
	}
}
		
		
		