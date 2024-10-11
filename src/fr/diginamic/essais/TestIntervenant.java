package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie salarie = new Salarie("Pierre", "Loriana", 1350.20);
        Pigiste pigiste = new Pigiste("Paul","Nicolas",31,100);

        System.out.println("Salaire de "+ salarie.getPrenom()+" est de "+ salarie.getSalaire()+" €");
        System.out.println("Salaire de "+ pigiste.getPrenom()+" est de "+ pigiste.getSalaire()+" €");

        salarie.afficherDonnees();
        pigiste.afficherDonnees();
    }
}
