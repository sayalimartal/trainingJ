
public class Date {
	private int d,m,y;
	public Date(int d,int m,int y)
	{
		this.d=d;
		this.m=m;
		this.y=y;
	}
	@Override
	public String toString() {
		return("Date is "+d+"/"+m+"/"+y);
	}
	
	public boolean isSmaller(Date d) {
		if(this.y>d.y)
			return false;
		else
		{
			if(this.m>d.m)
				return false;
			else
			{
				if(this.d>d.d)
					return false;
				else
					return true;
			}
		}
		}
	
	public int[] diff(Date d) {
		int[] dateDifference=new int[3];
		if(isSmaller(d)==true)
		{
			dateDifference[0]=d.d-this.d;
			dateDifference[1]=d.m-this.m;
			dateDifference[2]=d.y-this.y;
		}
		else
		{
			dateDifference[0]=this.d-d.d;
			dateDifference[1]=this.m-d.m;
			dateDifference[2]=this.y-d.y;
		}
		return dateDifference;
	}
}
	

