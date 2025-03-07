
import java.util.Scanner;

public class BloodDonationExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        System.out.println("Please enter your weight");
        int weight = scanner.nextInt();

        if (age < 18) {
            System.out.println("You can't donate blood");
        } else if (age > 65) {
            System.out.println("You can't donate blood");
        } else if (weight < 48) {
            System.out.println("You can't donate blood");
        } else {
            System.out.println("You are eligible to donate blood! Thank you!");
        }



    }
}


