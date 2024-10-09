package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> listeEntiers = new ArrayList<>();
        Collections.addAll(listeEntiers, -1, 5, 7, 3, -2, 4, 8, 5);
        System.out.println(listeEntiers + "\nla taille de liste est de " + listeEntiers.size());

        int max = Collections.max(listeEntiers);
        int min = Collections.min(listeEntiers);
        System.out.println("le nombre max est : "+ max + ",\nle nombre min est : "+ min);

        for (int i = 0; i < listeEntiers.size(); i++){
            if (min == listeEntiers.get(i)){
                System.out.println("le nombre retiré : " + listeEntiers.get(i));
                listeEntiers.remove(i);
            }
        }
        System.out.println("liste après avoir supprimer le plus petit element : " + listeEntiers);

        for (int i = 0; i < listeEntiers.size(); i++){
            int entier = listeEntiers.get(i);
            if (entier < 0){
                System.out.println("la nombre modifié : " + entier);
                listeEntiers.set(i, -entier);
            }
        }
        System.out.println(listeEntiers);
    }
}
