package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestTri {
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

        // Filtrer les villes avec plus de 25 000 habitants
        List<Ville> villesFiltrees = villes.stream()
                .filter(ville -> ville.getNbHabitants() > 25000)
                .collect(Collectors.toList());

        // Tri de la liste
        Collections.sort(villesFiltrees);

        // Affichage du résultat
        for (Ville ville : villesFiltrees) {
            System.out.println(ville);
        }
    }
}

