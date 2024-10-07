package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        int nbCompte = 12535454;
        float soldeCompte = 156.16f;
        Compte compte = new Compte(nbCompte, soldeCompte);

        System.out.println(compte);
        /* n'affiche pas le resultat */
    }
}
