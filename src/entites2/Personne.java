package entites2;

import entites.AdressePostale;

public class Personne {
    String nom, prenom;
    AdressePostale adressePostalePersonne;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        adressePostalePersonne = adressePostale;
    }

}
