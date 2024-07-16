package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites3.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        // Création d'un tableau de comptes
        Compte[] comptes = new Compte[2];

        // Instanciation de deux comptes : un compte normal et un compte rémunéré
        comptes[0] = new Compte("FR00005", 5000.0);
        comptes[1] = new CompteTaux("FR00001", 8000.0, 0.75);

        // Affichage des informations des comptes
        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
