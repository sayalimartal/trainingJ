
public class Distance {
	
	private int feet;
	private float inches;
	
	public int getFeet() {
		return feet;
	}
	
	public float getInches() {
		return inches;
	}
	
	public void set(int feet,float inches) {
		this.feet = feet;
		if(inches<12)
			this.inches = inches;
	}
	
	public Distance add(Distance D1,Distance D2) {
		Distance D3=new Distance();
		D3.feet=D1.feet+D2.feet;
		D3.inches=D1.inches+D2.inches;
		if(D3.inches>=12)
		{
			D3.inches-=12;
			D3.feet+=1;
		}
		return D3;
	}

}
