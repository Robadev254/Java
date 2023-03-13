import javax.swing.JOptionPane;
public class computeNumber{
	public static void main(String[] args){
	String firstNumber =JOptionPane.showInputDialog("Enter the first number:");	
	int number1= Integer.parseInt(firstNumber);
	
	
	String secondNumber=JOptionPane.showInputDialog("Enter the second number:");
	
	int number2=Integer.parseInt(secondNumber);
	
	int sum = number1 + number2;
	
	double average =(double)sum/2;
	
	int mul=number1*number2;
	JOptionPane.showMessageDialog(null,"the sum of the two numbers is:" +sum + "the averageof the two numbers is:"+average+"the product of the two numbers is :"+mul);
}
}