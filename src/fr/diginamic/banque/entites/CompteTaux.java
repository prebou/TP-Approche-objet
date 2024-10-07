package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    double tauxRemuneration;

    public CompteTaux(int numeroCompte, float soldeCompte, double taux) {
        super(numeroCompte, soldeCompte);
        tauxRemuneration = taux;
    }

    public String toString(){
        return super.toString() +"\nle taux est de : " + tauxRemuneration + " %";
    }
}
