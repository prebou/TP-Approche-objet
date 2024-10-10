package maps;

import listes.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Integer> mapVilles = new HashMap<>();
        ArrayList<Ville> villes = new ArrayList<>();

        Ville ville1 = new Ville("Massy",50549);
        Ville ville2 = new Ville("Palaiseau",34954);
        Ville ville3 = new Ville("Ris-Orangis",29040);

        Collections.addAll(villes,ville1,ville2,ville3);

        for (Ville ville:villes){
            mapVilles.put(ville.getNom(), ville.getNbHabitants());
        }

        int minValue = Collections.min(mapVilles.values());
        System.out.println("La valeur minimale est : " + minValue);
        String elementSuprimer = "";
        for (String cle:mapVilles.keySet()){
            if (minValue == mapVilles.get(cle)){
                System.out.println("La ville supprimer : "+ cle +", "+ mapVilles.get(cle));
                elementSuprimer = cle;
            }
        }
        mapVilles.remove(elementSuprimer);
        System.out.println("Les villes restantes : ");
        for (String cle:mapVilles.keySet()){
            System.out.println(cle + ", "+ mapVilles.get(cle));
        }

    }
}
