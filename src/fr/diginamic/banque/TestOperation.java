package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] tabOperations = new Operation[4];

        tabOperations[0] = new Credit("01/01/2024",680);
        tabOperations[1] = new Debit("02/01/2024", 30.99);
        tabOperations[2] = new Debit("03/01/2024", 45.99);
        tabOperations[3] = new Credit("04/01/2024", 3.23);

    }
}
