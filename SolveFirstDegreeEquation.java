package lab01;

import java.util.*;

public class SolveFirstDegreeEquation {
	public static void main(String[] args) {
		System.out.println("Consider equation ax + b = 0");
		Scanner read = new Scanner(System.in);
		System.out.print("a = ");
		float a = read.nextFloat();
		System.out.print("b = ");
		float b = read.nextFloat();
		read.close();
		if(a == 0) {
			if(b == 0)System.out.println("Equation has many roots");
			else System.out.println("Equation does not have any roots");
		}
		else {
			System.out.println("Equation has unique root: " + (-b/a));
		}
	}
}
