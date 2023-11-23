package org.example;

import java.util.*;

public class MenyRegister {

    private ArrayList<Meny> menyer = new ArrayList<>();
    private ArrayList<Rett> retter = new ArrayList<>();
    private int antallMenyer = 0;
    private int antallRetter = 0;

    public boolean registrereNyRett(String navn, String type, int pris) throws IllegalArgumentException{
        Rett rett = new Rett(navn, type, pris);
        if (finneDuplikat(navn, rett)){
            throw new IllegalArgumentException("Retten finnes allerede");
        }
        retter.add(rett);
        antallRetter++;
        return true;
    }
    public boolean registrereNyMeny(int menyNr){
        Meny meny = new Meny(menyNr);
        menyer.add(meny);
        antallMenyer++;
        return true;
    }
    public boolean finneDuplikat(String navn, Rett objekt){
            for (int i = 0; i < retter.size(); i++) {
                if (retter.get(i).equals(objekt)) {
                    return true;
                }
            }
        return false;
    }
    public int finneIndeksMedRettNavn(String navn) throws IllegalArgumentException{
        int indeks = 0;
        boolean finnes = false;
        for (int i = 0; i < retter.size(); i++) {
            if (retter.get(i).getNavn().equals(navn.trim())){
                indeks = i;
                finnes = true;
                break;
            }
        }
        if (!finnes){
            throw new IllegalArgumentException("Navn finnes ikke");
        }
        return indeks;
    }
    public int finneIndeksMedMenyNr(int menyNr) throws IllegalArgumentException{
        int indeks = 0;
        boolean finnes = false;
        for (int i = 0; i < menyer.size(); i++) {
            if (menyer.get(i).getMenyNr() == menyNr){
                indeks = i;
                finnes = true;
                break;
            }
        }
        if (!finnes){
            throw new IllegalArgumentException("Menynummer finnes ikke");
        }
        return indeks;
    }
    public String finneTypeMedNavn(String navn){
        Rett rett = retter.get(finneIndeksMedRettNavn(navn));
        if (rett != null){
            return rett.getType();
        }
        return null;
    }
    public int finneTotalPris(int indeks){
        Meny meny = menyer.get(indeks);
        int sum = 0;
        for (int i = 0; i < meny.finneSize(); i++) {
            Rett rett = meny.getMeny().get(i);
            sum += rett.getPris();
        }
        return sum;
    }
    public ArrayList<Meny> finneMenyerIntervall(int pris1, int pris2){
        ArrayList<Meny> menyerPris = new ArrayList<>();
        for (int i = 0; i < menyer.size(); i++) {
            if (finneTotalPris(i) > pris1 && finneTotalPris(i) < pris2){
                menyerPris.add(menyer.get(i));
            }
        }
        menyerPris.sort(Comparator.comparing(Meny::totalPris));
        Collections.reverse(menyerPris);
        return menyerPris;
    }
    public ArrayList<Rett> finneRetterVedType(String type) throws IllegalArgumentException{
        ArrayList<Rett> retterVedType = new ArrayList<>();
        boolean finnes = false;
        for (int i = 0; i < retter.size(); i++) {
            if (retter.get(i).getType().equals(type.trim())){
                retterVedType.add(retter.get(i));
                finnes = true;
            }
        }
        if (!finnes){
            throw new IllegalArgumentException("Type finnes ikke");
        }
        retterVedType.sort(Comparator.comparing(Rett::getType).thenComparing(Rett::getNavn).thenComparing(Rett::getPris));
        return retterVedType;
    }

    public boolean fordeleRettTilMeny(int menyNr, String navn){
        int indeks = finneIndeksMedRettNavn(navn);
        Meny meny = menyer.get(finneIndeksMedMenyNr(menyNr));
        meny.leggeTilRett(retter.get(indeks));
        return true;
    }
    public Rett finnRett(String navn){
        return retter.get(finneIndeksMedRettNavn(navn));
    }

    @Override
    public String toString() {
        return "MenyRegister!" + menyer + "\n Antall menyer: "+antallMenyer+ "\n Antall retter: "+antallRetter;
    }
}
