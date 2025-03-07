package Hafta1;

import java.util.Scanner;

public class PlaneTicketPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Değişkenleri kullanıcıdan alıp tanımlıyoruz.
        System.out.println("Please enter distance as kilometers");
        double distance = scanner.nextDouble();

        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        System.out.println("Please enter your voyage type (1=> one way, 2=> round trip)");
        int voyagetype = scanner.nextInt();



        //Hata kontrolü yapıyoruz
        if (distance <= 0 || age <=0 || (voyagetype !=1 && voyagetype != 2)) {
            System.out.println("You entered wrong data");
            return;
        }

        //fiyatı ve indirimi tanımlıyoruz
        double pricePerKm = 0.1;
        double baseprice = pricePerKm * distance;
        double discountrate = 0;


        //indirim koşullarını tanımlıyoruz
        if (age <= 12) {
            discountrate = 0.5;
        } else if ( age > 12 && age < 24 ) {
            discountrate = 0.1;
        } else if (age>65) {
            discountrate = 0.3;
        }


        //yaş indirimini giriyoruz
        double agediscount = baseprice * discountrate;
        double totalprice = baseprice - agediscount;

        //gidiş dönüş indirimi varsa giriyoruz
        if (voyagetype==2) {
            totalprice *= 0.8;
            totalprice *= 2;
        }

        //bilet fiyatını yazdırıyoruz
        System.out.println("Your ticket price is " + totalprice);


    }
}
