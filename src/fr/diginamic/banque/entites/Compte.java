package fr.diginamic.banque.entites;

public class Compte {
    private int numeroCompte;
    private float soldeCompte;

    public Compte(int numeroCompte, float soldeCompte){
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString(){
        return "Le numero de compte : " + numeroCompte + "\nVotre solde est de : " + soldeCompte + " €" ;
    }
}
