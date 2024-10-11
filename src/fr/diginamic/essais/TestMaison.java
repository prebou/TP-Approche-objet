package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Piece toilette= new WC(9,0);
        Piece sDb = new SalleDeBain(11,0);
        Piece salon = new Salon(20,0);
        Piece cuisine = new Cuisine(11,0);
        Piece chambre1 = new Chambre(12,-1);
        Piece chambre2 = new Chambre(10,1);
        Piece chambre3 = new Chambre(11,1);

        Maison maison = new Maison();
        maison.ajouterPiece(toilette);
        maison.ajouterPiece(sDb);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(chambre1);
        maison.ajouterPiece(chambre2);
        maison.ajouterPiece(chambre3);
        maison.ajouterPiece(null);

        System.out.println("superficie par etage : " + maison.getSuperficieParEtage(-1));
        System.out.println("superficie total : " + maison.getSuperficieTotal());
        System.out.println("superficie par type de piece : " + maison.getSuperficieParTypePiece(chambre1));
    }
}
