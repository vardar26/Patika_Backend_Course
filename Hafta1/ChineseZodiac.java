package Hafta1;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your birth year");
        int year = scanner.nextInt();

        if (year % 12 == 0) {
            System.out.println("Your Chinese Zodiac sign is: " + "Monkey");
        }
        if (year % 12 == 1) {
            System.out.println("Your Chinese Zodiac sign is: " + "Rooster");
        }
        if (year % 12 == 2) {
            System.out.println("Your Chinese Zodiac sign is: " + "Dog");
        }
        if (year % 12 == 3) {
            System.out.println("Your Chinese Zodiac sign is: " + "Pig");
        }
        if (year % 12 == 4) {
            System.out.println("Your Chinese Zodiac sign is: " + "Mouse");
        }
        if (year % 12 == 5) {
            System.out.println("Your Chinese Zodiac sign is: " + "Ox");
        }
        if (year % 12 == 6) {
            System.out.println("Your Chinese Zodiac sign is: " + "Tiger");
        }
        if (year % 12 == 7) {
            System.out.println("Your Chinese Zodiac sign is: " + "Rabbit");
        }
        if (year % 12 == 8) {
            System.out.println("Your Chinese Zodiac sign is: " + "Dragon");
        }
        if (year % 12 == 9) {
            System.out.println("Your Chinese Zodiac sign is: " + "Snake");
        }
        if (year % 12 == 10) {
            System.out.println("Your Chinese Zodiac sign is: " + "Horse");
        }
        if (year % 12 == 11) {
            System.out.println("Your Chinese Zodiac sign is: " + "Sheep");
        }

    }
}
