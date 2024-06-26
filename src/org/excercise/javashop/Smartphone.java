package org.excercise.javashop;

public class Smartphone extends Prodotto{

    private int codiceIMEI;
    private int memoria;

    public Smartphone(String nome, String descrizione, double prezzo, int codiceIMEI, int memoria) {
        super(nome, descrizione, prezzo);

        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;
    }


    // METODI


    @Override
    public String toString() {
        return "Smartphone{" +super.toString()+
                "codiceIMEI=" + codiceIMEI +
                ", memoria=" + memoria +
                '}';
    }



    //GETTER

    public int getCodiceIMEI() {
        return codiceIMEI;
    }

    public int getMemoria() {

        return memoria;
    }

    //SETTER


    public void setCodiceIMEI(int codiceIMEI) {
        this.codiceIMEI = codiceIMEI;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
