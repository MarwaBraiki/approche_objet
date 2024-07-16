package fr.diginamic.listes;

import java.util.Objects;

public class Ville {
    private String nom;
    private int nbHabitants;

    // Constructeur
    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    // Redéfinir la méthode equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ville ville = (Ville) obj;
        return nbHabitants == ville.nbHabitants && nom.equals(ville.nom);
    }

    // Redéfinir la méthode hashCode
    @Override
    public int hashCode() {
        return Objects.hash(nom, nbHabitants);
    }
}
