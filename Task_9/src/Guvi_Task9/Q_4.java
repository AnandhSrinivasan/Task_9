package Guvi_Task9;

public class Q_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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