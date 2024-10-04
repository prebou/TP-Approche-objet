package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adressePostale = new AdressePostale(9,"rue stalingrad", 92700,"colombes");
        Personne personne1 = new Personne("Paul","Lea");
        Personne personne2 = new Personne("Suresh", "Prebou");
        Personne personne3 = new Personne("Suresh", "Prebou", adressePostale);

        AdressePostale adresseModifier = new AdressePostale(2,"rue Felix Faure", 92700, "colombes");
        personne1.modifierAdresse(adresseModifier);
        personne1.modifierNom("Pierre");
        personne1.modifierPrenom("Leo");
        personne1.affichePersonne();
        System.out.println(personne3.getAdresse());
        personne2.affichePersonne();
        personne3.affichePersonne();



    }
}
