package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        List<String> villes = new ArrayList<>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        // Recherche de la ville avec le plus grand nombre de lettres
        String villeMax = "";
        for (String ville : villes) {
            if (ville.length() > villeMax.length()) {
                villeMax = ville;
            }
        }
        System.out.println("Ville avec le plus grand nombre de lettres : " + villeMax);

        // Mettre tous les noms de villes en majuscules
        List<String> villesMaj = new ArrayList<>();
        for (String ville : villes) {
            villesMaj.add(ville.toUpperCase());
        }

        // Supprimer les villes dont le nom commence par "N"
        Iterator<String> iterator = villesMaj.iterator();
        while (iterator.hasNext()) {
            String ville = iterator.next();
            if (ville.startsWith("N")) {
                iterator.remove();
            }
        }

        System.out.println("Liste résultante : " + villesMaj);
    }
}
