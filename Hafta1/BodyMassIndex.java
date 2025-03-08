package Hafta1;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //kullanıcıdan boyu al
        System.out.println("Please enter your height as meter");
        double height = scanner.nextDouble();

        //kullanıcıdan kiloyu al
        System.out.println("Please enter your weight as kilogram");
        double weight = scanner.nextDouble();

        // vücut kitle endeksi = kilo / boy2
        int bmi = (int) (weight / (height*height));

        //kullanıcıya çıktı ver
        System.out.println("Your BMI is  " + bmi);



    }}
