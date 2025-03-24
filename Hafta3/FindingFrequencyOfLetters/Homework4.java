package Hafta3.FindingFrequencyOfLetters;

import java.util.*;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word");
        String word = scanner.nextLine().toLowerCase().replace(" ", "");;


        HashMap<Character,Integer> frequencyMap = new HashMap<>();

        //  Harfleri kontrol ediyoruz
        for (char ch : word.toCharArray()) {
            if (frequencyMap.containsKey(ch)) {
                // Eğer harf daha önce eklenmişse değeri artır
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                // Eğer harf daha önce yoksa değeri 1 yap
                frequencyMap.put(ch, 1);
            }

        }
        System.out.println("\nHarf Frekansları:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        scanner.close();

    }

}
