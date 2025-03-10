package Hafta1.ArrayExercises;

import java.util.Scanner;

public class SearchMatrix {
    public static void main(String[] args) {

        int [][] matrix = {

                {1,2},
                {4,5},
                {7,8}

        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir değer giriniz ");


        int input = scanner.nextInt();



        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(input == matrix[i][j]) {
                    System.out.println("Satır " + i + " " + "Sütun " + j);
                }

            }

        }
    }
}
