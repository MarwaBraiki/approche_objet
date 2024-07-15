package entites;

public class AdressePostale {
    public int numeroRue;
    public String libelleRue;
    public int codePostal;
    public String ville;

    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return this.numeroRue + " " + this.libelleRue + ", " + this.codePostal + " " + this.ville;
    }
}