package org.excercise.javashop;

public class Televisori extends Prodotto{

    private String dimensioni;
    private boolean isSmart;

    public Televisori(String nome, String descrizione, double prezzo, String dimensioni, boolean isSmart) {
        super(nome, descrizione, prezzo);

        this.dimensioni = dimensioni;
        this.isSmart = isSmart;
    }

    // METODI

    @Override
    public String toString() {
        return "Televisori{" + super.toString()+
                "dimensioni='" + dimensioni +
                ", isSmart=" + isSmart +
                '}';
    }


    //GETTER

    public String getDimensioni() {
        return dimensioni + "pollici";
    }

    public boolean isSmart() {

        return isSmart;
    }

    //SETTER


    public void setDimensioni(String dimensioni) {
        this.dimensioni = dimensioni;
    }

    public void setSmart(boolean smart) {

        isSmart = smart;
    }
}
