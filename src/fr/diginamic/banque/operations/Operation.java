package fr.diginamic.banque.operations;

public abstract class Operation {
    private String date;
    private double montant;

    // Constructeur
    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    // Méthode abstraite getType() à redéfinir dans les sous-classes
    public abstract String getType();

    // Getters pour les attributs
    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }
}
