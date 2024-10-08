package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne moyenne = new CalculMoyenne();
        moyenne.ajout(2);
        moyenne.ajout(6);
        moyenne.ajout(5.5);
        System.out.println(moyenne.calcul());
    }
}
