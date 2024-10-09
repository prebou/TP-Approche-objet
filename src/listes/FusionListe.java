package listes;


import java.util.ArrayList;
import java.util.Collections;

public class FusionListe {
    public static void main(String[] args) {
        ArrayList<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        ArrayList<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        ArrayList<String> liste3 = new ArrayList<>();
        /*for (String element: liste1){
            liste3.add(element);
        }
        for (String element: liste2){
            liste3.add(element);
        }*/
        /*Iterator<String> list1Modif = liste1.iterator();
        Iterator<String> list2Modif = liste2.iterator();
        while (list1Modif.hasNext()){
            liste3.add(list1Modif.next());
        }
        while (list2Modif.hasNext()){
            liste3.add(list2Modif.next());
        }*/
        liste3.addAll(liste1);
        liste3.addAll(liste2);
        System.out.println(liste3);
    }
}
