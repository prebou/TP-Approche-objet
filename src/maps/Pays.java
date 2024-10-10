package maps;

public class Pays {
    private String nom, continent;
    private int nbHabitants;

    public Pays(String nom, int nbHabitants, String continent){
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    public String getNom(){
        return this.nom;
    }
    public int getNbHabitants(){
        return this.nbHabitants;
    }
    public String getContinent(){
        return this.continent;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }
}
