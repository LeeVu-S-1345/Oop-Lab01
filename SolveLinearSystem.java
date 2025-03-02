package lab01;

import java.util.*;

public class SolveLinearSystem {
	public static void main(String[] args) {
		System.out.println("Consider a system of first-degree equations");
		System.out.println("ax + by = m");
		System.out.println("cx + dy = n\n");
		Scanner read = new Scanner(System.in);
		System.out.print("a = ");
		float a = read.nextFloat();
		System.out.print("b = ");
		float b = read.nextFloat();
		System.out.print("m = ");
		float m = read.nextFloat();
		System.out.print("c = ");
		float c = read.nextFloat();
		System.out.print("d = ");
		float d = read.nextFloat();
		System.out.print("n = ");
		float n = read.nextFloat();
		read.close();
		float D = a*d - b*c;
		float D2 = a*n - c*m;
		float D1 = m*d - n*b;
		if(a == 0 && b == 0 && c == 0 && d == 0 && m == 0 && n == 0)
			System.out.println("The system of equations has infinitely many roots (x, y) in R*R");
		else if(D != 0)
			System.out.printf("The system of equations has unique root (x, y) = (%f/%f, %f/%f)", D1, D, D2, D);
		else if(D == 0 && (D1 !=0 || D2 != 0))
			System.out.println("The system of equations has no roots");
		else if(D == 0 && D1 == 0 && D2 == 0){
			if(n*n + m*m == 0) {
				if(a == 0 && c == 0)
					System.out.println("The system of equations has infinitely many roots (x, y) = (k, 0)");
				else if(b == 0 && d == 0)
					System.out.println("The system of equations has infinitely many roots (x, y) = (0, k)");
				else if(a == 0 && b == 0)
					System.out.printf("The system of equations has infinitely many roots (x, y) = (k, -%fk/%f)", c, d);
				else if(c == 0 && d == 0)
					System.out.printf("The system of equations has infinitely many roots (x, y) = (k, -%fk/%f)", a, b);
			}
			else if(m == 0) {
				if(c == 0 && d == 0)
					System.out.println("The system of equations has no roots");
				else if(c == 0)
					System.out.printf("The system of equations has infinitely many roots (x, y) = (k, %f)", n/d);
				else if(d == 0)
					System.out.printf("The system of equations has infinitely many roots (x, y) = (%f, k)", n/c);
				else
					System.out.printf("The system of equations has infinitely many roots (x, y) = (k, (n-%fk)/%f)", c, d);
			}
			else if(n == 0) {
				if(a == 0 && b == 0)
					System.out.println("The system of equations has no roots");
				else if(a == 0)
					System.out.printf("The system of equations has infinitely many roots (x, y) = (k, %f)", m/b);
				else if(b == 0)
					System.out.printf("The system of equations has infinitely many roots (x, y) = (%f, k)", m/a);
				else
					System.out.printf("The system of equations has infinitely many roots (x, y) = (k, (m-%fk)/%f)", a, b);
			}
			else
				if(a == 0 && b == 0 && c == 0 && d == 0)
					System.out.println("The system of equations has no roots");
				else if(a == 0)
					System.out.printf("The system of equations has infinitely many roots (x, y) = (k, %f)", m/b);
				else if(b == 0)
					System.out.printf("The system of equations has infinitely many roots (x, y) = (%f, k)", m/a);
				else if(a != 0 && b != 0)
					System.out.printf("The system of equations has infinitely many roots (x, y) = (k, (m-%fk)/%f)", a, b);
		}
	}
}
