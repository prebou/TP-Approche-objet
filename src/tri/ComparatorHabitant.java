package tri;

import listes.Ville;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

    @Override
    public int compare(Ville autre, Ville premier){
        if (autre.getNbHabitants() < premier.getNbHabitants() ) {
            return 1;
        } else if (autre.getNbHabitants() > premier.getNbHabitants()) {
            return -1;
        }
        return 0;

    }
}
