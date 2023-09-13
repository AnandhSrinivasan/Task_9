package Guvi_Task9;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("Enter the value of n: "); int n = sc.nextInt(); for (int i
		 * = 1; i <= n; i++) { for (int j = 1; j < i; j++) { System.out.print(" "); }
		 * for (int k = 1; k <= n - i + 1; k++) { System.out.print("*"); }
		 * System.out.println(); } sc.close();
		 */

		int n = 5; // Number of rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}