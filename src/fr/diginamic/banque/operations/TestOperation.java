package fr.diginamic.banque.operations;

import fr.diginamic.banque.operations.Credit;
import fr.diginamic.banque.operations.Debit;
import fr.diginamic.banque.operations.Operation;

public class TestOperation {
    public static void main(String[] args) {
        // Création d'un tableau d'opérations avec au moins 4 opérations de crédits et de débits
        Operation[] operations = new Operation[4];
        operations[0] = new Credit("2024-07-16", 1000.0);
        operations[1] = new Credit("2024-07-17", 1500.0);
        operations[2] = new Debit("2024-07-18", 500.0);
        operations[3] = new Debit("2024-07-19", 200.0);

        // Affichage des informations des opérations
        for (Operation operation : operations) {
            System.out.println("Date : " + operation.getDate());
            System.out.println("Montant : " + operation.getMontant());
            System.out.println("Type : " + operation.getType());
            System.out.println();
        }

        // Calcul du montant global des opérations
        double montantGlobal = 0;
        for (Operation operation : operations) {
            if (operation instanceof Credit) {
                montantGlobal += operation.getMontant();
            } else if (operation instanceof Debit) {
                montantGlobal -= operation.getMontant();
            }
        }

        System.out.println("Montant global des opérations : " + montantGlobal);
    }
}
