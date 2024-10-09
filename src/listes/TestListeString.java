package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> listeString = new ArrayList<>();
        Collections.addAll(listeString, "Nice","Carcassonne", "Narbonne", "Lyon",
                "Foix", "Pau", "Marseille", "Tarbes");
        String max = listeString.get(0);
        for (String element:listeString){
            if (max.length()<element.length()){
                max = element;
            }
        }
        System.out.println(max);

        for (int i = 0; i < listeString.size();i++){
            listeString.set(i, listeString.get(i).toUpperCase());
            if (listeString.get(i).startsWith("N")){
                listeString.remove(i);
            }

        }
        Iterator<String> iterVilles = listeString.iterator();
        while (iterVilles.hasNext()){
            if (iterVilles.next().startsWith("N")){
                iterVilles.remove();
            }
        }
        System.out.println(listeString);

        /*for (String element : listeString){
            if (element.startsWith("n")){

            }
        }*/
    }

}
