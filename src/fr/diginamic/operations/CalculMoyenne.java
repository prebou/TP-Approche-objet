package fr.diginamic.operations;

import java.util.Arrays;

// à revoir
public class CalculMoyenne {
    private static int i=0;
    private static double[] tableau;
    private static double moyenne, somme;


    public double[] ajout(double valeur){
        System.out.println(" i = "+ i);

        tableau = new double[i];
        if (i == tableau.length) {
            double[] nouveauTableau = new double[tableau.length + 1];
            System.arraycopy(tableau, 0, nouveauTableau, 0, tableau.length);
            tableau = nouveauTableau;
        }
        tableau[i++] = valeur;


        return tableau;
    }

    public double calcul(){
        for (int i=0;i < tableau.length;i++ ){
             somme = somme + tableau[i];
            System.out.println(tableau[i]);
        }
        moyenne = somme / tableau.length;
        System.out.println("longueur de tableau : " +  tableau.length);

        return moyenne;
    }

}
