package Guvi_Task9;

import java.util.Scanner;

public class Q_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();   
        System.out.print("Enter the room rent per day: ");
        double roomRent = sc.nextDouble();        
        double finalTariff;
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                finalTariff = roomRent * 1.2000;
                break;
            default:
                finalTariff = roomRent;
                break;
        }
        System.out.println("The final tariff for the room is: " + finalTariff);
        sc.close();
	}
}
