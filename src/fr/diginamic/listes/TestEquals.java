package fr.diginamic.listes;

public class TestEquals {
    public static void main(String[] args) {
        // Création de deux instances de Ville avec les mêmes attributs
        Ville ville1 = new Ville("Toulouse", 471941);
        Ville ville2 = new Ville("Toulouse", 471941);

        // Test de la méthode equals
        System.out.println("Test equals avec mêmes attributs : " + ville1.equals(ville2)); // Doit retourner true

        // Modification d'un attribut
        Ville ville3 = new Ville("Toulouse", 1000000);
        System.out.println("Test equals avec attributs différents : " + ville1.equals(ville3)); // Doit retourner false

        // Test de l'opérateur ==
        System.out.println("Test == avec mêmes attributs : " + (ville1 == ville2)); // Doit retourner false
        System.out.println("Test == avec mêmes objets : " + (ville1 == ville1)); // Doit retourner true

        // Pour que == retourne true, il faut que les deux références pointent vers le même objet
        Ville ville4 = ville1;
        System.out.println("Test == avec même référence : " + (ville1 == ville4)); // Doit retourner true
    }
}

