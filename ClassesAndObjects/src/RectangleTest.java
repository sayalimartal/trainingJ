import java.util.Scanner;
public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rectangle1=new Rectangle();
		Rectangle rectangle2=new Rectangle();

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter the length of the rectangle");
		rectangle1.setLength(scanner.nextFloat());

		System.out.println("Enter the breadth of the rectangle");
		rectangle1.setBreadth(scanner.nextFloat());
		
		System.out.println("Length of the rectangle is "+rectangle1.getLength()); 
		System.out.println("Breadth of the rectangle is "+rectangle1.getBreadth());

		//Display the area and the perimeter of the rectangle
		System.out.println("Area of the rectangle is "+rectangle1.area());
		System.out.println("Perimeter of the rectangle is "+rectangle1.perimeter());

		System.out.println("Is a second rectangle present? Yes/No");
		String answer=scanner.next();
		
		if(answer.equals("Yes"))
		{
			System.out.println("Enter the length of the rectangle");
			rectangle2.setLength(scanner.nextFloat());

			System.out.println("Enter the breadth of the rectangle");
			rectangle2.setBreadth(scanner.nextFloat());
		
			System.out.println("Length of the rectangle is "+rectangle2.getLength()); 
			System.out.println("Breadth of the rectangle is "+rectangle2.getBreadth());

			//Display the area and the perimeter of the rectangle
			System.out.println("Area of the rectangle is "+rectangle2.area());
			System.out.println("Perimeter of the rectangle is "+rectangle2.perimeter());
		
			if(rectangle1.area() == rectangle2.area())
				System.out.println("The two rectangles have the same area");
			else
				System.out.println("TThe two rectangles have different areas");
		}
	}
}
