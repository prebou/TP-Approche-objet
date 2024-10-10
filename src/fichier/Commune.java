package fichier;

public class Commune {
    String nom, nomRegion, codeDepartement, populationTotaleS;
    int populationTotale;

    Commune(String nom, String codeDepartement, String nomRegion, int populationTotale){
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }
    Commune(String nom, String codeDepartement, String nomRegion, String populationTotale){
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotaleS = populationTotale;
    }
}
