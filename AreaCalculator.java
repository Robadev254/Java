import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        int attempts = 0;
        
        do {
            System.out.println("which figure do you want to calculate the area for?");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.print("choose among the ones above: ");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("what is the base?: ");
                    double base = input.nextDouble();
                    System.out.print("\nwhat is the height?: ");
                    double height = input.nextDouble();
                    double triangleArea = 0.5 * base * height;
                    System.out.println("\nThe area of the triangle is " + triangleArea2);
                    attempts = 0; // reset attempts if input is valid
                    break;
                    
                case 2:
                    System.out.print("what is the length of the rectangle?: ");
                    double length = input.nextDouble();
                    System.out.print("\nwhat is the width of the rectangle: ");
                    double breadth = input.nextDouble();
                    double rectangleArea = length * breadth;
                    System.out.println("The area of the rectangle is " + rectangleArea);
                    attempts = 0; // reset attempts if input is valid
                    break;
                    
                case 3:
                    System.out.print("what is the radius of the circle: ");
                    double radius = input.nextDouble();
                    double circleArea = Math.PI * radius * radius;
                    System.out.println("The area of the circle is " + circleArea);
                    attempts = 0; // reset attempts if input is valid
                    break;
                    
                default:
                    System.out.println("SORRY!! YOU CAN ONLY ENTER A NUMBER BETWEEN 1 AND 3");
                    attempts++;
                    break;
            }
            
            if (attempts == 3) {
                System.out.println("YOU CAN ONLY HAVE THREE ATTEMPTS AT A GO!");
                break;
            }
        } while (attempts < 3);
        
        input.close();
    }
}