package lab01;

import java.util.*;

public class AddMatrices {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter size of the matrices: ");
		int n = read.nextInt();
		int[][] A = new int[n][n];
		int[][] B = new int[n][n];
		int[][] C = new int[n][n];
		System.out.printf("Enter matrix A of size %dx%d:\n", n, n);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) A[i][j] = read.nextInt();
		}
		System.out.printf("Enter matrix B of size %dx%d:\n", n, n);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) B[i][j] = read.nextInt();
		}
		read.close();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) C[i][j] = A[i][j] + B[i][j];
		}
		System.out.println("Sum of two matrices A and B is matrix C:");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) System.out.print(C[i][j] + " ");
			System.out.print("\n");
		}
	}
}
