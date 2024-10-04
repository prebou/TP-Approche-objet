package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        int nbRue = 8, cdPostal = 92700;
        String rue = "rue Stalingrade", ville = "Colombes";

        AdressePostale adressePostale = new AdressePostale(nbRue,rue,cdPostal,ville);
        AdressePostale adressePostale1 = new AdressePostale(99,"rue Prague",92600,"Gennevilliers");


    }
}
