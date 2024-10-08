package fr.diginamic.operations;

public class Operations {
    private double resultat;

    public double calcul(double a , double b, char operateur){

        if (operateur == '+'){
            resultat = a + b;
        } else if (operateur == '-') {
            resultat = a - b;
        } else if (operateur == '*') {
            resultat = a * b;
        } else if (operateur == '/') {
            resultat = a / b;
        } else {
            System.out.println("Veuillez choisir parmis ses operateurs : +, -, *, /");
        }


        return resultat;
    }
}
