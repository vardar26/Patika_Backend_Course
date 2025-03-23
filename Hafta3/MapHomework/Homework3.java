package Hafta3.MapHomework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework3 {
    public static void main(String[] args) {


        Map<String, Integer> students = new TreeMap<>();
        students.put("Ali", 75);
        students.put("Veli", 85);
        students.put("Hasan", 95);
        students.put("Ayşe", 59);
        students.put("Ahmet", 100);

        System.out.println("Treemap ile puan sıralaması" + "\n" +students.toString().replace(",","\n"));
        System.out.println();


        Map<String, Integer> students2 = new HashMap<>();
        students2.put("Ali", 75);
        students2.put("Veli", 85);
        students2.put("Hasan", 95);
        students2.put("Ayşe", 59);
        students2.put("Ahmet", 100);



        System.out.println("Hashmap ile sırasız  " + "\n" + students2.toString().replace(",","\n"));
        System.out.println();


        Map<String, Integer> students3 = new LinkedHashMap<>();
        students3.put("Ali", 75);
        students3.put("Veli", 85);
        students3.put("Hasan", 95);
        students3.put("Ayşe", 59);
        students3.put("Ahmet", 100);



        System.out.println("LinkedHashMap ile eklenme sırasına göre " + "\n" + students3.toString().replace(",","\n"));
    }
}