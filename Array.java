package lab01;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the number of elements in an array: ");
		int n = read.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			int m = read.nextInt();
			sum += m;
			array.add(m);
		}
		Collections.sort(array);
		System.out.println("Sorted array:");
		for(int i = 0; i < n; i++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.println("\nThe sum of all elements in array: " + sum);
		System.out.println("The average of all elements in array: " + (float)(sum)/n);
		read.close();
	}
}
