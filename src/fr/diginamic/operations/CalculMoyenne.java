package fr.diginamic.operations;

import java.util.ArrayList;


// à revoir
public class CalculMoyenne {
    private double moyenne, somme;
    ArrayList<Double> tableau = new ArrayList<>();


    public ArrayList ajout(double valeur){
        tableau.add(valeur);
        return tableau;
    }

    public double calcul(){
        for (int i=0;i < tableau.size();i++ ){
             somme = somme + tableau.get(i);
            System.out.println(tableau.get(i));
        }
        moyenne = somme / tableau.size();
        System.out.println("longueur de tableau : " +  tableau.size());
        return moyenne;
    }

}
