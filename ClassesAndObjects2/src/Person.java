
public class Person {

	private String name;
	private Date dob;
	public Person(String n,int d, int m, int y)
	{
		this.name=n;
		dob=new Date(d,m,y);	
	}
	public void display()
	{
		int [] dateDiff=new int[3];
		System.out.println("Name: "+name);
		System.out.println("Date of birth: "+dob.toString());
		Date curDate=new Date(21,7,2018);
		dateDiff=dob.diff(curDate);
		System.out.println("Age: "+dateDiff[2]+" Years "+dateDiff[1]+" Months "+dateDiff[0]+" Days ");
	}
	public void olderOne(Person p)
	{
		int [] dateDiff=new int[3];
		dateDiff=dob.diff(p.dob);
		if(dob.isSmaller(p.dob))
			System.out.println(p.name+" is older than "+name+" by "+dateDiff[2]+" years, "+dateDiff[1]+" months and "+dateDiff[0]+" Days ");
		else
			System.out.println(name+" is older than "+p.name+" by "+dateDiff[2]+" years, "+dateDiff[1]+" months and "+dateDiff[0]+" Days ");
	}
}
