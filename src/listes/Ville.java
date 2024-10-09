package listes;


public class Ville implements Comparable<Ville> {
    String nom;
    int nbHabitants;

    //Tp 13
    @Override
    public int compareTo(Ville autre) {
        //return nom.compareTo(autre.nom);
        if (autre.nbHabitants < nbHabitants) {
            return 1;
        } else if (autre.nbHabitants > nbHabitants) {
            return -1;
        }
        return 0;
    }

    Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String toString() {
        return nom + " = " + nbHabitants + " d'habitants";
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public String getNom(){
        return nom;
    }
}
