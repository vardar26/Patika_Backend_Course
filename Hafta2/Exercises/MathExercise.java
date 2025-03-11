package Exercises;

import java.util.Scanner;

public class MathExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //kullanıcıdan sayı al
        System.out.println("Please enter a decimal number");
        double number = scanner.nextDouble();

        //sayıyı yukarı aşağı ve en yakın tam sayıya yuvarla
        System.out.println("Aşağı yuvarlama : " + Math.floor(number));
        System.out.println("Yukarı yuvarlama : " + Math.ceil(number));
        System.out.println("En yakın integere yuvarlama : " + Math.round(number));
    }
}
