package fr.diginamic.entites;

import java.util.ArrayList;

public class Salarie {
    String nom, prenom;
    double salaire;

    Salarie(String salarie){
        String[] tab = salarie.split(";");
        nom = tab[0].toUpperCase();
        prenom = tab[1];
        String salaireString = tab[2].replace(" ","");
        salaire= Double.parseDouble(salaireString);

    }

}
