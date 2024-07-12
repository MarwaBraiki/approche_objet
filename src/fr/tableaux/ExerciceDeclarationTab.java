package fr.tableaux;

public class ExerciceDeclarationTab {

    public static void main(String[] args) {

        // Déclaration du tableau d'entiers contenant tous les chiffres suivants : 8, -7, 12, 1, -2, 14, 17,9

        int[] tab = {8, -7, 12, 1, -2, 14, 17, 9};

        // Affichage de l'élément à l'index 0 du tableau

        System.out.println("Élément à l'index 0 du tableau : " + tab[0]);

        // Affichage de la longueur du tableau

        System.out.println("Longueur du tableau : " + tab.length);

        // Affichage de l'entier positionné au dernier index du tableau

        int dernierIndex = tab.length - 1;
        System.out.println("Élément à l'index " + dernierIndex + " du tableau : " + tab[dernierIndex]);
    }
}
