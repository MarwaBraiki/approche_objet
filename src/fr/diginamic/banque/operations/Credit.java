package fr.diginamic.banque.operations;

public class Credit extends Operation {

    public Credit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}