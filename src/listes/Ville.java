package listes;


import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) {
            return false;
        }
        Ville autre = (Ville) obj;

        //return Objects.equals(autre.nom, nom) && (Objects.equals(autre.nbHabitants, nbHabitants));
        return nom.equals(autre.nom) && nbHabitants == autre.nbHabitants;
    }

    public Ville(String nom, int nbHabitants) {
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
