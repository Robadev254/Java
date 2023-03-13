import java.util.Scanner;
public class side{
	public static void main(String [] args){
		double k,y,x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side K: ");
		k = scanner.nextDouble();
		System.out.println("Enter side Y :");
		y= scanner.nextDouble();		
		x = Math.sqrt((k * k) +(y * y));
		System.out.println("The lenth of your hypoteneus is :" +x);
		scanner.close();
	}
}