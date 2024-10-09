package listes;

public class Ville {
    String nom;
    int nbHabitants;

    Ville(String nom, int nbHabitants){
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }
    public String toString(){
        return nom + " a " + nbHabitants + " d'habitants";
    }
}
