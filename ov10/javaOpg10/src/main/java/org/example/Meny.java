package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Meny {

    private ArrayList<Rett> meny;
    private int antallRetter = 0;
    private int menyNr;
    public void leggeTilRett(Rett rett){
        meny.add(rett);
        antallRetter++;
    }
    public int finneSize(){
        return meny.size();
    }
    public Meny(int menyNr) {
        this.menyNr = menyNr;
        this.meny = new ArrayList<>();
    }

    public int getMenyNr() {
        return menyNr;
    }

    public void setMenyNr(int menyNr) {
        this.menyNr = menyNr;
    }

    public void okeRetter(){
        antallRetter++;
    }

    public int getAntallRetter() {
        return antallRetter;
    }

    public ArrayList<Rett> getMeny() {
        return meny;
    }
    public int totalPris(){
        int sum = 0;
        for (int i = 0; i < meny.size(); i++) {
            Rett rett = meny.get(i);
            sum += rett.getPris();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meny meny1)) return false;
        return getMenyNr() == meny1.getMenyNr() && Objects.equals(getMeny(), meny1.getMeny());
    }

    @Override
    public String toString() {
        return "\n Menynummer "+menyNr+ ": \n" +meny +", antall retter: "+antallRetter;
    }
}
