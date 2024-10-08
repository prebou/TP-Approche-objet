package entites;

public class Theatre {
    String nom;
    static int maxNbPersonnes = 150;
    static int totalClientsInscrits;
    static double recetteTotal;




    public void inscrire(int nbClients, double prixPlace){
        if (totalClientsInscrits <= maxNbPersonnes ){
            totalClientsInscrits = totalClientsInscrits + nbClients;
            recetteTotal = recetteTotal + (totalClientsInscrits * prixPlace);
        }
        if (totalClientsInscrits >= maxNbPersonnes ){
            System.out.println("Erreur la capacité max est atteinte");
        }
    }

    public int getTotalClientsInscrits(){
        return totalClientsInscrits;
    }

    public double getRecetteTotal(){
        return recetteTotal;
    }
}
