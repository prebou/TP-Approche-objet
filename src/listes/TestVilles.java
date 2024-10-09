package listes;

import tri.ComparatorHabitant;
import tri.ComparatorNom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        Ville ville1 = new Ville("Nice", 343000);
        Ville ville2 = new Ville("Carcassonne", 47800);
        Ville ville3 = new Ville("Narbonne", 53400);
        Ville ville4 = new Ville("Lyon", 484000);
        Ville ville5 = new Ville("Foix", 9700);
        Ville ville6 = new Ville("Pau", 77200);
        Ville ville7 = new Ville("Marseille", 850700);
        Ville ville8 = new Ville("Tarbes", 40600);

        Collections.addAll(villes, ville1, ville2, ville3, ville4, ville5, ville6, ville7, ville8);

        ArrayList<Integer> nb = new ArrayList<>();
        for (Ville v: villes){
            nb.add(v.nbHabitants);
        }
        Ville plusPeuple = new Ville("",0);
        Ville moinsPeuple = new Ville("", plusPeuple.nbHabitants);


        for (Ville v: villes){
            if (plusPeuple.nbHabitants < v.nbHabitants){
                plusPeuple = v;
            }
            if (moinsPeuple.nbHabitants > v.nbHabitants || moinsPeuple.nbHabitants == 0){
                moinsPeuple = v;
            }
        }
        System.out.println("La ville le plus peuplée : " + plusPeuple + "\nLa ville le moins peuplée : " + moinsPeuple);

        villes.remove(moinsPeuple);
        System.out.println(villes);

        for (int i = 0; i < villes.size(); i++) {
            int habitants = villes.get(i).nbHabitants;
            if ( habitants > 100000){
                Ville majuscule = new Ville(villes.get(i).nom.toUpperCase(),habitants);
                villes.set(i,majuscule);
            }
        }
        System.out.println(villes);
        Collections.sort(villes);
        System.out.println("Dans l'ordre : " + villes);

        Collections.sort(villes, new ComparatorHabitant());
        System.out.println(villes);
        Collections.sort(villes, new ComparatorNom());
        System.out.println(villes);

    }
}
