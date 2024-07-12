package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {

        // Déclaration du tableau de villes

        String[] villes = {"Toulouse", "Lyon", "Marseille", "Paris", "Bordeaux"};

        // Affichage des éléments du tableau

        System.out.println("Les villes sont :");
        System.out.println(villes[0]);
        System.out.println(villes[1]);
        System.out.println(villes[2]);
        System.out.println(villes[3]);
        System.out.println(villes[4]);

       // Affichage de la longueur du tableau

        System.out.println("Le longueur du tableau villes est : " + villes.length);


        // Modification de l'élément à l'index 3

        villes[3] = "Reims";

        // Réaffichage des éléments du tableau après modification

        System.out.println("\nLes villes après modification :");
        System.out.println(villes[0]);
        System.out.println(villes[1]);
        System.out.println(villes[2]);
        System.out.println(villes[3]);
        System.out.println(villes[4]);
    }
}