package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        // Crée une instance de la classe Compte
        Compte compte = new Compte();
        compte.setNumero("FR123456789");
        compte.setSolde(1000.50);

        // Affiche l'instance créée
        System.out.println(compte);
    }
}
