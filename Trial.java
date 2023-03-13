import javax.swing.JOptionPane;
public class Trial{
public static void main (String [] args){
	String firstNumber = JOptionPane.showInputDialog("Enter the first number");
	
	
	int number1 = Integer.parseInt(firstNumber);
	
	String secondNumber = JOptionPane.showInputDialog("Enter the second number:");
	
	int number2 =Integer.parseInt(secondNumber);
	
	int sum = number1 + number2;
	 double average = (double) sum/2;
	 
	 JOptionPane.showMessageDialog( null, " the sum of the two number is " + sum + "\n the avarege id :" + average);
	 
}
}