package Hafta1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a year");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " is a leap year!");
        }
        if ((year % 100 == 0 && year % 400 != 0) || year % 4 !=0 ) {
            System.out.println(year + " is not a leap year!");
        }

    }
}
