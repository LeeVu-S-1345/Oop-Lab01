package lab01;

import java.util.*;

public class SolveSecondDegreeEquation {
	public static void main(String[] args) {
		System.out.println("Consider equation ax^2 + bx + c = 0");
		Scanner read = new Scanner(System.in);
		System.out.print("a = ");
		float a = read.nextFloat();
		System.out.print("b = ");
		float b = read.nextFloat();
		System.out.print("c = ");
		float c = read.nextFloat();
		read.close();
		if(a == 0) {
			if(b == 0) {
				if(c == 0)System.out.println("Equation has many roots");
				else System.out.println("Equation does not have any roots");
			}
			else {
				System.out.println("Equation has unique root: " + (-c/b));
			}
		}
		else {
			float delta = b*b - 4*a*c;
			if(delta < 0) System.out.println("Equation does not have any roots");
			else if (delta == 0) System.out.println("Equation has unique root: " + (-b/(2*a)));
			else {
				float x1 = (-b + (float)Math.sqrt(delta))/(2*a);
				float x2 = (-b - (float)Math.sqrt(delta))/(2*a);
				System.out.println("Equation has two roots: " + x1 + " and " + x2);
			}
		}
	}
}
