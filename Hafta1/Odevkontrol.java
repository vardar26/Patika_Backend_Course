package Hafta1;

import java.util.Scanner;

public class Odevkontrol {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Matrisin satır bilgisi: ");
        int row = input.nextInt();
        System.out.print("Matrisin sütun bilgisi: ");
        int column = input.nextInt();

        int[][] firstMatrix = new int[row][column];

        System.out.println("Matrisin değerlerini giriniz: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                firstMatrix[i][j] = input.nextInt();
            }
        }

        //İlk matris
        for (int i = 0; i < firstMatrix.length; i++) {
            for(int j =0; j<firstMatrix[i].length; j++){
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] newMatrix = new int[column][row];
        for (int i = 0; i < row; i++) {
            for(int j=0; j<column; j++){
                newMatrix[j][i]=firstMatrix[i][j];
            }
        }

        // Yeni oluşturulan (transpoz) matris
        System.out.println("Matrisin transpozu ...");
        for (int i = 0; i < newMatrix.length; i++) {
            for(int j =0; j<newMatrix[i].length; j++){
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }}}