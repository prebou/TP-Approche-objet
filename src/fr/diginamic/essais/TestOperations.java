package fr.diginamic.essais;


import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        Operations calcul = new Operations();
        double result = calcul.calcul(7,7,'-');
        System.out.println(result);
    }
}
