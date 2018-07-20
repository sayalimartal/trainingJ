
public class Time {

	private int hours;
	private int minutes;
	
	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public void setTime(int hours,int minutes) {
		this.hours = hours;
		if(minutes<60)
			this.minutes = minutes;
	}
	
	public Time sum(Time T1,Time T2) {
		Time T3=new Time();
		T3.hours=T1.hours+T2.hours;
		T3.minutes=T1.minutes+T2.minutes;
		if(T3.minutes>=60)
		{
			T3.minutes-=60;
			T3.hours+=1;
		}
		return T3;
	}
}
