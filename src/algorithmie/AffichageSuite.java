package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {

        // Afficher tous les nombres de 1 à 10 inclus avec une boucle for

        System.out.println("1) Nombres de 1 à 10 inclus avec une boucle for :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Affichage séparateur

        System.out.println("***********************************************************");

        // Afficher tous les nombres pairs entre 0 et 10 inclus avec une boucle for

        System.out.println("2) Nombres pairs entre 0 et 10 inclus avec une boucle for :");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        // Affichage séparateur

        System.out.println("***********************************************************");

        // Afficher tous les nombres impairs entre 0 et 9 inclus avec une boucle for

        System.out.println("3) Nombres impairs entre 0 et 9 inclus avec une boucle for :");
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }

        // Affichage séparateur

        System.out.println("***********************************************************");

        // Afficher tous les nombres de 1 à 10 inclus avec une boucle while

        System.out.println("4) Nombres de 1 à 10 inclus avec une boucle while :");
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        // Affichage séparateur

        System.out.println("***********************************************************");

        // Afficher tous les nombres pairs entre 0 et 10 inclus avec une boucle while

        System.out.println("5) Nombres pairs entre 0 et 10 inclus avec une boucle while :");
        int k = 0;
        while (k <= 10) {
            System.out.println(k);
            k += 2;
        }

        // Affichage séparateur

        System.out.println("***********************************************************");

        // Afficher tous les nombres impairs entre 0 et 9 inclus avec une boucle while

        System.out.println("6) Nombres impairs entre 0 et 9 inclus avec une boucle while :");
        int l = 1;
        while (l < 10) {
            System.out.println(l);
            l += 2;
        }
    }
}
