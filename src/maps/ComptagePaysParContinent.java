package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> pays = new ArrayList<>();
        Pays pays1 = new Pays("France", 65_000_000, "Europe");
        Pays pays2 = new Pays("Allemagne", 80_000_000, "Europe");
        Pays pays3 = new Pays("Belgique", 10_000_000, "Europe");
        Pays pays4 = new Pays("Russie", 150_000_000, "Asie");
        Pays pays5 = new Pays("Chine", 1_400_000_000, "Asie");
        Pays pays6 = new Pays("Indonésie", 220_000_000, "Océanie");
        Pays pays7 = new Pays("Australie", 20_000_000, "Océanie");

        Collections.addAll(pays, pays1, pays2, pays3, pays4, pays5, pays6, pays7);

        HashMap<String, Integer> comptage = new HashMap<>();
        for (Pays p : pays){
            String continent = p.getContinent();
            comptage.put(continent, comptage.getOrDefault(continent,0)+1);
        }
        for (String cle: comptage.keySet()) {
            System.out.println("Il y a " + comptage.get(cle) + " pays en " + cle);
        }

    }
}
