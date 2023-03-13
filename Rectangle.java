public class Rectangle {
    int length,width;
    int area()
    {
    	return length*width;
    }
    int perimeter()
    {
    	return 2*(length+width);
    }
    public static void main(String[] args) {
    	Rectangle rec=new Rectangle();
    	rec.length=10;
    	rec.width=5;
    	System.out.println("The area of the Rectangle is: " + 	rec.area() + "and perimeter is: " + rec.perimeter());
    }
}
