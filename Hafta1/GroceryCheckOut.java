package Hafta1;

import java.util.Scanner;

public class GroceryCheckOut {

    public static float pearp = 2.14f;
    public static float applep = 2.47f;
    public static float tomatop =1.11f;
    public static float bananap =0.95f;
    public static float eggplantp =5.00f;

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

       double totalprice = (pear * pearp ) + (apple * applep  ) + (tomato * tomatop) + (banana * bananap) + (eggplant * eggplantp);
       System.out.println("Your total price is " + totalprice + "$");


    }
}
