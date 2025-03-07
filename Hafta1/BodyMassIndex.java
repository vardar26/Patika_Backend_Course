package Hafta1;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter your height as meter");
        double height = scanner.nextDouble();

        System.out.println("Please enter your weight as kilogram");
        double weight = scanner.nextDouble();

        int bmi = (int) (weight / (height*height));

        System.out.println("Your BMI is  " + bmi);

    }}
