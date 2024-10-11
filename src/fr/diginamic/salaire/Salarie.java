package fr.diginamic.salaire;

public class Salarie extends Intervenant{
    private double salaireMensuel;

    public Salarie(String nom, String prenom, double salaireMensuel){
        super(nom, prenom);
        this.salaireMensuel = salaireMensuel;
    }

    @Override
    public double getSalaire() {
        return this.salaireMensuel;
    }

    @Override
    public void afficherDonnees() {
        System.out.println("\nNom : " + getNom().toUpperCase() + "\nPrenom : " + getPrenom() + "\nSalaire : " + salaireMensuel + "\nStatut : Salarié(CDI ou CDD\n");
    }
}
