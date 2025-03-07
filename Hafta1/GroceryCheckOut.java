package Hafta1;

import java.util.Scanner;

public class GroceryCheckOut {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //Kullanıcıya hangi üründen kaç kilo aldığının sorulması ve değişkenlerin tanımlanması
       System.out.println("How many kgs of pear?");
       double pear = scanner.nextDouble();

       System.out.println("How many kgs of apple?");
       double apple = scanner.nextDouble();

       System.out.println("How many kgs of tomatoes?");
       double tomato = scanner.nextDouble();

       System.out.println("How many kgs of bananas?");
       double banana = scanner.nextDouble();

       System.out.println("How many kgs of eggplant?");
       double eggplant = scanner.nextDouble();

       //toplam fiyatın hesaplanması

       double totalprice = (pear * 2.14) + (apple * 3.67) + (tomato * 1.11) + (banana * 0.95) + (eggplant * 5);
       System.out.println("Your total price is " + totalprice + "$");


    }
}
