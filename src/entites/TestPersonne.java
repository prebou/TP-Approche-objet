package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adressePostale = new AdressePostale();
        adressePostale.numeroDeRue = 48;
        adressePostale.libellRue = "avenue gbp";
        adressePostale.codePostal = 92700;
        adressePostale.ville = "Colombes";

        Personne personne1 = new Personne();
        Personne personne2 = new Personne();

        personne1.nom = "Suresh";
        personne1.prenom = "Parameswaran";
        personne1.adressePostalePersonne = adressePostale;

        personne2.nom = "Dugue";
        personne2.prenom = "Hugo";
        personne2.adressePostalePersonne = adressePostale;

        System.out.println(personne1.adressePostalePersonne.ville);

    }
}
