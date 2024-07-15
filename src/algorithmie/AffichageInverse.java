package algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Afficher les éléments du tableau

        System.out.println("Éléments du tableau dans l'ordre :");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        // Affichage séparateur

        System.out.println("-----------------------------");

        // Afficher les éléments du tableau dans l'ordre inverse

        System.out.println("Éléments du tableau dans l'ordre inverse :");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        // Affichage séparateur

        System.out.println("-----------------------------");


        // Créer un tableau arrayCopy et copier les éléments de array dans arrayCopy

        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }

        // Afficher les éléments de arrayCopy pour vérifier la copie

        System.out.println("Éléments du tableau arrayCopy :");
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.println(arrayCopy[i]);
        }
    }
}
