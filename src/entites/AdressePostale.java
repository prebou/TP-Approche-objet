package entites;

public class AdressePostale {
    int numeroDeRue, codePostal;
    String libellRue, ville;

    AdressePostale(int nbRue, String rue, int codePostal, String ville){
        numeroDeRue = nbRue;
        libellRue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }


}
