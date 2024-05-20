package org.excercise.javashop;

public class Cuffie extends Prodotto{

    private String colore;
    private boolean isWireless;

    public Cuffie(String nome, String descrizione, double prezzo, String colore, boolean isWireless ) {
        super(nome, descrizione, prezzo);

        this.colore = colore;
        this.isWireless = isWireless;

    }



    // METODI

    @Override
    public String toString() {
        return "Cuffie{" +super.toString()+
                "colore=" + colore +
                ", isWireless=" + isWireless +
                '}';
    }


    //GETTER

    public String getColore() {
        return colore;
    }

    public boolean isWireless() {

        return isWireless;
    }

    //SETTER


    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
}
