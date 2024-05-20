package org.excercise.javashop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 2;
        int nCarrello = 0;
        Prodotto[] carrello = new Prodotto[max];
        boolean prosegui = true;

        while (prosegui){
            System.out.println("Scegli uno di questi prodotti ");
            System.out.println("Premi 1 (Smartphone): ");
            System.out.println("Premi 2 (Televisori): ");
            System.out.println("Premi 3 (Cuffie): ");
            System.out.println("Premi 4 (ESCI): ");

            int sceltaUtente = scanner.nextInt();
            scanner.nextLine();


            if( sceltaUtente == 1 ){

                System.out.print("Nome Prodotto: ");
                String nome = scanner.nextLine();

                System.out.print("Descrizione: ");
                String descrizione = scanner.nextLine();

                System.out.print("Prezzo: ");
                int prezzo = scanner.nextInt();

                System.out.print("Codice IMEI: ");
                int codiceIMEI = scanner.nextInt();

                System.out.print("Memoria: ");
                int memoria = scanner.nextInt();

                Smartphone smartphone = new Smartphone(nome, descrizione, prezzo, codiceIMEI, memoria);
                carrello[nCarrello] = smartphone;
                nCarrello++;

            }
            else if (sceltaUtente == 2) {

                System.out.print("Nome Prodotto: ");
                String nome = scanner.nextLine();

                System.out.print("Descrizione: ");
                String descrizione = scanner.nextLine();

                System.out.print("Prezzo: ");
                int prezzo = scanner.nextInt();

                System.out.print("Dimensioni: ");
                String dimensioni = scanner.nextLine();
                scanner.nextLine();

                System.out.print("E' Smart?: ");
                boolean isSmart = scanner.nextBoolean();

                Televisori televisori = new Televisori(nome, descrizione, prezzo,dimensioni, isSmart);

                carrello[nCarrello] = televisori;
                nCarrello++;

            }
            else if (sceltaUtente == 3) {

                System.out.print("Nome Prodotto: ");
                String nome = scanner.nextLine();

                System.out.print("Descrizione: ");
                String descrizione = scanner.nextLine();

                System.out.print("Prezzo: ");
                int prezzo = scanner.nextInt();

                System.out.print("Colore: ");
                String colore = scanner.nextLine();
                scanner.nextLine();

                System.out.print("E' Wireless?: ");
                boolean isWireless = scanner.nextBoolean();

                Cuffie cuffie = new Cuffie(nome, descrizione, prezzo, colore, isWireless);
                carrello[nCarrello] = cuffie;
                nCarrello++;

            }
            else if (sceltaUtente == 4){
                prosegui = false;
            }

        }

        for (int i=0;i<nCarrello;i++) {
            System.out.println(carrello[i].toString());
        }

    }
}
