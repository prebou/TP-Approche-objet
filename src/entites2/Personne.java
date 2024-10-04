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

    public void affichePersonne(){
        System.out.println("Nom : " + nom.toUpperCase() + " Prénom : " + prenom);
    }
    public void modifierNom(String nom){
        this.nom = nom;
    }

    public void modifierPrenom(String prenom){
        this.prenom = prenom;
    }

    public void modifierAdresse(AdressePostale adressePostale){
        adressePostalePersonne = adressePostale;
    }

    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public AdressePostale getAdresse(){
        return adressePostalePersonne;
    }


}
