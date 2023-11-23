package org.example;

import java.util.Objects;

public class Rett {

    private String navn;
    private final String type;
    private int pris;

    public Rett(String navn, String type, int pris) {
        this.navn = navn;
        this.type = type;
        this.pris = pris;
    }
    public String getType() {
        return type;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rett rett)) return false;
        return Objects.equals(getNavn(), rett.getNavn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNavn());
    }

    @Override
    public String toString() {
        return "Rett: "+navn +", "+ type +", "+ pris;
    }
}
