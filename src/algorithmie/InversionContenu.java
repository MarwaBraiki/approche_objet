package algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

          // Créer un tableau arrayCopy et copier les éléments de array dans arrayCopy en ordre inverse

        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length - 1 - i];
        }
        // Afficher les éléments des deux tableaux

        System.out.println("Éléments du tableau array :");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Affichage séparateur

        System.out.println("-----------------------------");

        System.out.println("Éléments du tableau arrayCopy (ordre inverse) :");
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.println(arrayCopy[i]);
        }
    }
}
