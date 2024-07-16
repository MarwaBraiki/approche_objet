package fr.diginamic.banque.entites;

public class Compte {
    private String numero;
    private double solde;

    // Constructeur
    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    // Méthode toString() pour afficher les informations du compte
    @Override
    public String toString() {
        return "Compte [numero=" + numero + ", solde=" + solde + "]";
    }

}
