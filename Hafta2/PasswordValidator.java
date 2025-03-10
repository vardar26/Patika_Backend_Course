import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Create your password: ");
        String password = scanner.next();


        if (password.length() >= 8 && //şifre 8 karakterden uzunsa
                !password.contains(" ") && //şifre boşluk içeriyorsa
                Character.isUpperCase(password.charAt(0))&&
                password.charAt(password.length() - 1) == '?') {     // Son karakter ? olmalı

            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }// İlk karakter büyükse

    }
}
