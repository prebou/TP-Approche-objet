package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adressePostale = new AdressePostale(9,"rue stalingrad", 92700,"colombes");
        Personne personne1 = new Personne("Dugue","Hugo");
        Personne personne2 = new Personne("Suresh", "Prebou");
        Personne personne3 = new Personne("Suresh", "Prebou", adressePostale);


        System.out.println(personne3);

    }
}
