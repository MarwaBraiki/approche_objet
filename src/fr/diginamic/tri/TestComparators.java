package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparators {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // Tri par nombre d'habitants
        Collections.sort(villes, new ComparatorHabitant());
        System.out.println("Tri par nombre d'habitants :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }

        // Tri par nom
        Collections.sort(villes, new ComparatorNom());
        System.out.println("\nTri par nom :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}
