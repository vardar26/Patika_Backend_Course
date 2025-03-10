package Hafta1;

import java.util.Scanner;

public class LoopExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number ");
        int num = scanner.nextInt();

        int sumodd = 0;
        int sumdoub= 0;


        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sumdoub += i;

            } else {
                sumodd += i;
            }


        } System.out.println("Tek sayıların toplamı= " + sumodd);
          System.out.println("Çift sayılar toplamı " + sumdoub);
    }}