package Hafta3.ArrayListExercise3;

import java.util.ArrayList;

public class Flowers {

    ArrayList <String> flowers = new ArrayList<>();
    ArrayList <String> treespecies = new ArrayList<>();

    public void addFlower (){
        flowers.add("Lale");
        flowers.add("Zambak");
        flowers.add("Krizantem");
    }

    public void addTree () {
        treespecies.add("Gül");
        treespecies.add("Ortanca");
        treespecies.add("Yasemin");

    }
    public void listeEkleme  () {
        flowers.addAll(treespecies);
    }

    public void printFlowers () {
        System.out.println(flowers);
    }

    public void printTrees (){
        System.out.println(treespecies);
    }

    public static void main(String[] args) {
        Flowers plantslist = new Flowers();

        plantslist.addFlower();
        plantslist.printFlowers();

        plantslist.addTree();
        plantslist.printTrees();

        plantslist.listeEkleme();
        plantslist.printFlowers();
    }
}
