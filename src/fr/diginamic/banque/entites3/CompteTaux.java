package fr.diginamic.banque.entites3;

import fr.diginamic.banque.entites.Compte;

public class CompteTaux extends Compte {
    private double tauxRemuneration;

    // Constructeur
    public CompteTaux(String numero, double solde, double tauxRemuneration) {
        super(numero, solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    // Redéfinition de la méthode toString() pour afficher les informations du compte avec le taux de rémunération
    @Override
    public String toString() {
        return super.toString() + " [tauxRemuneration=" + tauxRemuneration + "]";
    }
}
