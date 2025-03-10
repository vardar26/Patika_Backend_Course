package Hafta1;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {


        //Kullanıcıdan matrisin satır ve sütün sayısını al
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = scanner.nextInt();

        System.out.println("enter number of columns");
        int columns = scanner.nextInt();

        //matrisi oluştur
        int [][] matrix = new int[rows][columns];

        //matrisin sütun ve satırlarındaki sayıları kullanıcıdan al
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Element in row " + i + " column  " + j);
                matrix[i][j]= scanner.nextInt();

            }

        }

        //Orjinal matrisi yazdırıyourz
        System.out.println("Original Matrix:");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]+ " "); //printLn olursa alt alta yazıyor?
            }
            System.out.println();
        }

        //transpozunu almak için boş bir matris oluşturuyouruz

        int [][] transpose = new int[columns][rows];

        //ters çeviriyoruz

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix [i][j];

            }

        }

        //transpozu yazdırıyoruz

        System.out.println("Transpose :");

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();

        }

    }
}