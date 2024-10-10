package fr.diginamic.chaines;

import java.util.ArrayList;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        char premierCaractere = chaine.charAt(0), c = ';';
        int longueurChaine = chaine.length();
        String nom = chaine.substring(0,chaine.indexOf(c));
        System.out.println("Premier caractère: " + premierCaractere +
                "\nLongueur de la chaine : " + longueurChaine +
                "\nIndex du premier ';' : " + chaine.indexOf(c) +
                "\nLe nom en majuscule : "+ nom.toUpperCase()+
                "\nLe nom en minuscule : "+ nom.toLowerCase());

        String[] tab = chaine.split(";");
        String salaire = tab[2].replace(" ","");
        System.out.println("salaire : " + salaire);
        double salaireneDouble = Double.parseDouble(salaire);
        for (String element : tab){
            System.out.println(element);
        }


    }
}
