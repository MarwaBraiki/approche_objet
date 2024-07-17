package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("New York", Continent.AMERIQUE));
        villes.add(new Ville("Paris", Continent.EUROPE));
        villes.add(new Ville("Pékin", Continent.ASIE));
        villes.add(new Ville("Moscou", Continent.EUROPE));
        villes.add(new Ville("Berlin", Continent.EUROPE));
        villes.add(new Ville("Sydney", Continent.OCEANIE));
        villes.add(new Ville("Sao Paulo", Continent.AMERIQUE));
        villes.add(new Ville("Dakar", Continent.AFRIQUE));

        // Affichage des villes avec leur continent respectif
        System.out.println("Liste des villes avec leur continent :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}

