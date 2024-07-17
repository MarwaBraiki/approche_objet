package fr.diginamic.tri;  // Assurez-vous que le package est correct

public class Ville implements Comparable<Ville> {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

//    @Override
//    public int compareTo(Ville autre) {
//        // Tri par ordre alphabétique du nom
//        return this.nom.compareTo(autre.nom);
//    }

//@Override
//public int compareTo(Ville autre) {
//    return Integer.compare(this.nbHabitants, autre.nbHabitants); // Tri par nombre d'habitants
//}

    @Override
    public int compareTo(Ville autre) {
        return Integer.compare(autre.nbHabitants, this.nbHabitants); // Tri décroissant par nombre d'habitants
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
    }
}
