
public class Rectangle {
	
private float length;
private float breadth;

public float getLength() {
	return length;
}
public void setLength(float length) {
	this.length = length;
}
public float getBreadth() {
	return breadth;
}
public void setBreadth(float breadth) {
	this.breadth = breadth;
}

public float area()
{
	float area=length*breadth;
	return area;
}

public float perimeter()
{
	float perimeter=2*(length+breadth);
	return perimeter;
}

}
