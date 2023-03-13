import java.util.Scanner;

public class ifStatement{
	public static void main(String[]args){
		int age;
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
		if (age==12){
			System.out.println("You are a child");
		}
		else if (age >= 13){
			System.out.println("You are an aged person");
		}
		else if(age >= 75){
			System.out.println("You are a teenager ");
		}
		else{
			System.out.println("You are an adult");
		}
	}
}