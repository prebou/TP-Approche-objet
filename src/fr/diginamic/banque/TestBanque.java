package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        int nbCompte = 12535454;
        float soldeCompte = 156.16f;
        Compte compte = new Compte(nbCompte, soldeCompte);

        System.out.println(compte);
        /* n'affiche pas le resultat */

        Compte compte1 = new Compte(1256245, 600);
        CompteTaux compte2 = new CompteTaux(16588,500, 0.35);
        Compte[] comptes = new Compte[2];
        comptes[0] = compte1;
        comptes[1] = compte2;

        for (Compte com:comptes){
            System.out.println(com);
        }

    }
}
