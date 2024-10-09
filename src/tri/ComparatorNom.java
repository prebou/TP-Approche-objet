package tri;

import listes.Ville;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {

    @Override
    public int compare(Ville autre, Ville premier) {
        return autre.getNom().compareTo(premier.getNom());
    }
}
