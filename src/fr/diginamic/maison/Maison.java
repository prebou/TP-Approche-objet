package fr.diginamic.maison;

import java.util.ArrayList;

public class Maison {
    ArrayList<Piece> pieces = new ArrayList<>();

    /*public Maison(int capaciteMax) {
        pieces = new ArrayList<>();
    }*/

    public void ajouterPiece(Piece piece){
        if (piece == null){
            //throw new IllegalArgumentException("La pièce ne peut pas être nulle");
            System.out.println("La pièce ne peut pas être nulle");

        }else {
            pieces.add(piece);
        }

    }

    public double getSuperficieTotal(){
        double superficieTotal = 0;
        for (int i = 0; i < pieces.size(); i++) {
            superficieTotal = superficieTotal + pieces.get(i).getSuperficie();
        }
        return superficieTotal;
    }

    public double getSuperficieParEtage(int etage){
        double superficieEtage = 0;
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getEtage() == etage){
                superficieEtage = superficieEtage + pieces.get(i).getSuperficie();

            }
        }
        return superficieEtage;
    }

    public double getSuperficieParTypePiece(Piece piece){
        double superficiePiece = 0;
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getClass() == piece.getClass()){
                superficiePiece = superficiePiece + pieces.get(i).getSuperficie();
            }
        }
        return superficiePiece;
    }

}
