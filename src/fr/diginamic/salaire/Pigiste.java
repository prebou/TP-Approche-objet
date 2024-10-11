package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
    private int nbJoursTravailles;
    private double montantJournalier;

    public Pigiste(String nom, String prenom, int nbJoursTravailles, double montantJournalier){
        super(nom, prenom);
        this.nbJoursTravailles = nbJoursTravailles;
        this.montantJournalier = montantJournalier;
    }
    @Override
    public double getSalaire() {
        return montantJournalier * nbJoursTravailles;
    }

    public void afficherDonnees() {
        System.out.println("\nNom : " + getNom().toUpperCase() + "\nPrenom : " + getPrenom() + "\nSalaire : " + getSalaire() + "\nStatut : Pigist(payé/jour)\n");
    }


}
