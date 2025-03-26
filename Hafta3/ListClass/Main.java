package Hafta3.ListClass;

public class Main {

    public static void main(String[] args) {
        Mylist <String> list = new Mylist<>();


        list.add("Hasan");
        list.add("Hüseyin");
        list.add("Osman");

        System.out.println(list);


        System.out.println("Size is " + list.size());


        System.out.println("2nd element is " + list.get(2));

        list.remove(1);
        System.out.println("After 2nd element deleted " + list);

        list.clear();
        System.out.println("Temizledikten sonra: " + list);

        // Büyüyen kapasiteyi test et
        for (int i = 0; i < 15; i++) {
            list.add("Eleman " + i);
        }
        System.out.println(list);
        System.out.println("Size: " + list.size());



    }
}

