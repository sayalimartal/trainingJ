import java.util.*;
class Date
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the complete date in the form (DD,MM,YYYY)");
		String date=sc.nextLine();
		String[] dmy=date.split(",");
		System.out.print(dmy[0]+"/");
		switch(dmy[1])
		{
			case "01":System.out.print("January");
					  break;
			case "02":System.out.print("February");
					  break;
			case "03":System.out.print("March");
					  break;
			case "04":System.out.print("April");
					  break;
			case "05":System.out.print("May");
					  break;
			case "06":System.out.print("June");
					  break;
			case "07":System.out.print("July");
					  break;
		    case "08":System.out.print("August");
					  break;
			case "09":System.out.print("September");
					  break;
		    case "10":System.out.print("October");
		              break;
			case "11":System.out.print("November");
			          break;
		    case "12":System.out.print("December");
		              break;
			default:System.out.print("Invalid month");
					break;			  
		}
		System.out.println("/"+dmy[2]);
	}
}