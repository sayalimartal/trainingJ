
public class PersonTest {

	public static void main(String[] args) {
		
		Person P1=new Person("Ram",5,6,1980);
		Person P2=new Person("Shayam",2,3,1987);
		
		P1.display();
		P2.display();
		
		P1.olderOne(P2);
	}
}
