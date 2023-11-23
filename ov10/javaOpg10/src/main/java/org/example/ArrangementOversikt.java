package org.example;

import java.util.Arrays;

public class ArrangementOversikt {

    private Arrangement[] arrangementer = new Arrangement[1];
    private int antall = 0;

    public boolean registrereArr(int nummer, String navn, String sted, String arrangor, String type, long klokkeslett)throws IllegalArgumentException{
        if (finneDuplikat(nummer)){
            throw new IllegalArgumentException("Nummeret finnes");
        }
        if (antall == arrangementer.length){
            utvidTabell();
        }
        arrangementer[antall] = new Arrangement(nummer, navn, sted, arrangor, type, klokkeslett);
        antall++;
        return true;
    }

    public void utvidTabell(){
        Arrangement[] nyTabell = new Arrangement[arrangementer.length + 1];
        for (int i = 0; i < arrangementer.length; i++) {
            nyTabell[i] = arrangementer[i];
        }
        arrangementer = nyTabell;
    }
    public boolean finneDuplikat(int nummer){
        boolean finnes = false;
            for (int i = 0; i < arrangementer.length; i++) {
                if (arrangementer[i] != null && arrangementer[i].getNummer() == nummer) {
                    finnes = true;
                    break;
                }
            }
        return finnes;

    }
    public int finnelengde(){
        return arrangementer.length;
    }

    public Arrangement[] finneArrVedSted(String sted) throws IllegalArgumentException{
        Arrangement[] arrVedStedListe = new Arrangement[antall];
        int indeksListe = 0;
        for (int i = 0; i < arrangementer.length; i++) {
            if (arrangementer[i] != null && arrangementer[i].getSted().equals(sted.trim())){
                arrVedStedListe[indeksListe] = arrangementer[i];
                indeksListe++;
            }
        }
        return arrVedStedListe;
    }

    public Arrangement[] finneArrVedDato(long dato1, long dato2) throws IllegalArgumentException{
        Arrangement[] arrVedDatoListe = new Arrangement[antall];
        int indeksListe = 0;
        for (int i = 0; i < arrangementer.length; i++) {
            if (arrangementer[i].getKlokkeslett() > dato1 && arrangementer[i].getKlokkeslett() < dato2){
                arrVedDatoListe[indeksListe] = arrangementer[i];
                indeksListe++;
            }
        }
        return arrVedDatoListe;
    }

    public void printeListe(Arrangement[] liste){
        int nummer = 1;
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] == null){
                System.out.println("");
            } else {
                System.out.println("\n" + nummer + ": " + liste[i]);
                nummer++;
            }
        }
    }

    @Override
    public String toString() {
        return "ArrangementOversikt{" +
                "arrangementer=" + Arrays.toString(arrangementer) +
                '}';
    }
}
