package Guvi_Task9;

import java.util.Scanner;

public class Q_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        sc.close();
	        String reversed = " ";
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed += input.charAt(i);
	        }
	        System.out.println("Reversed string: " + reversed);
    }
}
