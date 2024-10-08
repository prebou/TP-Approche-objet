package fr.diginamic.essais;

import entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();
        theatre.inscrire(30,20.30);
        theatre.inscrire(30,20.30);
        theatre.inscrire(30,20.30);
        theatre.inscrire(30,20.30);
        theatre.inscrire(30,20.30);
        theatre.inscrire(30,20.30);

        System.out.println("total de clients inscrits : " + theatre.getTotalClientsInscrits());
        System.out.println("recette total de l'établissement : " + theatre.getRecetteTotal());
    }
}
