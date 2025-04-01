package Hafta5.EnumEgzersizes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Çalışma saatlerini görmek için bir gün seçin");
        System.out.println("1. Pazartesi");
        System.out.println("2. Salı");
        System.out.println("3. Çarşamba");
        System.out.println("4. Perşembe");
        System.out.println("5. Cuma");
        System.out.println("6. Cumartesi");
        System.out.println("7. Pazar");
        System.out.println("Seçiminizi girin ->");

        if (!scanner.hasNextInt()) {
            System.out.println("Geçersiz giriş! Lütfen 1-7 arasında bir sayı girin.");
            return;
        }

        int input = scanner.nextInt();
        handleSelection(input);



    }

        public static void handleSelection (int input){
            switch (input) {

                case 1:
                    if (input == 1) {
                        System.out.println(WeekDays.PAZARTESI + " günü çalışma saat " + WeekDays.PAZARTESI.getStart() + " başlar. Saat " + WeekDays.PAZARTESI.getFinish() + " biter.");
                    } break;
                case 2:
                    if (input == 2) {
                        System.out.println(WeekDays.SALI + " günü çalışma saat " + WeekDays.SALI.getStart() + " başlar. Saat " + WeekDays.SALI.getFinish() + " biter.");
                    } break;
                case 3:
                    if (input == 3) {
                        System.out.println(WeekDays.CARSAMBA + " günü çalışma saat " + WeekDays.CARSAMBA.getStart() + " başlar. Saat " + WeekDays.CARSAMBA.getFinish() + " biter.");
                    } break;
                case 4:
                    if (input == 4) {
                        System.out.println(WeekDays.PERSEMBE + " günü çalışma saat " + WeekDays.PERSEMBE.getStart() + " başlar. Saat " + WeekDays.PERSEMBE.getFinish() + " biter.");
                    }break;
                case 5:
                    if (input == 5) {
                        System.out.println(WeekDays.CUMA + " günü çalışma saat " + WeekDays.CUMA.getStart() + " başlar. Saat " + WeekDays.CUMA.getFinish() + " biter.");
                    }break;
                case 6:
                    if (input == 6) {
                        System.out.println(WeekDays.CUMARTESI + " günü çalışma saat " + WeekDays.CUMARTESI.getStart() + " başlar. Saat " + WeekDays.CUMARTESI.getFinish() + " biter.");
                    }break;
                case 7:
                    if (input == 7) {
                        System.out.println(WeekDays.PAZAR + " günü çalışma saat " + WeekDays.PAZAR.getStart() + " başlar. Saat " + WeekDays.PAZAR.getFinish() + " biter.");
                    }break;
                default:
                    System.out.println("Yanlış bir giriş yaptınız");

            }


        }
    }
