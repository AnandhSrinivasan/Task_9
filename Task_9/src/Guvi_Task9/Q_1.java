package Guvi_Task9;

import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }sc.close();
    }
    public static boolean isPalindrome(String ip) {
        int length = ip.length();
        for (int i = 0; i < length / 2; i++) {
            if (ip.charAt(i) != ip.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
	}
}
