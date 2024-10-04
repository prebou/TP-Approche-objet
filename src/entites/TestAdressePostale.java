package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adressePostale = new AdressePostale();
        AdressePostale adressePostale1 = new AdressePostale();

        adressePostale.numeroDeRue = 8;
        adressePostale.libellRue = "Rue stalingrad";
        adressePostale.codePostal = 92700;
        adressePostale.ville = "Colombes";

        adressePostale1.numeroDeRue = 1;
        adressePostale1.libellRue = "rue Prague";
        adressePostale1.codePostal = 92600;
        adressePostale1.ville = "Gennevilliers";


    }
}
