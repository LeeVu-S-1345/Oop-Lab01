package lab01;

import javax.swing.JOptionPane;

public class TwoDoubleNumber {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog(null, "Please input the first number: ",
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		String num2 = JOptionPane.showInputDialog(null, "Please input the second number: ",
				"Input the second number", JOptionPane.INFORMATION_MESSAGE);
		double x1 = Double.parseDouble(num1);
		double x2 = Double.parseDouble(num2);
		System.out.println("Two numbers entered are: " + x1 + " and " + x2);
		System.out.println("Sum of these two double numbers: " + (x1 + x2));
		System.out.println("Difference of these two double numbers: " + (x1 - x2));
		System.out.println("Product of these two double numbers: " + (x1 * x2));
		if(x2 == 0) System.out.println("Cannot execute division operation!");
		else System.out.println("Quotient of these two double numbers: " + (x1/x2));
	}

}
