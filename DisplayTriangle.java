package lab01;

import java.util.Scanner;

public class DisplayTriangle {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("n=");
		int n = read.nextInt();
		read.close();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			for(int j = 1; j <= n-1; j++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
