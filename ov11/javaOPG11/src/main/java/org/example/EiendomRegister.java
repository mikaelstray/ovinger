package org.example;

import java.util.ArrayList;

/**
 * <h1>Eiendomregister klassen</h1>
 *  * Klasse med at register av eiendommene som kan registrere eiendommer,
 *    samt en rekke andre metoder for a gjennomfore det oppgaven spor om.
 *  * @author Mikael Stray Froyshov
 *  * @version 1.0
 *  * @since 2023-07-02
 */
public class EiendomRegister {

    private ArrayList<Eiendom> eiendomListe = new ArrayList<>();
    private int antallEiendommer = 0;

    /**
     * Registrerer eiendommen som tas inn i eiendomlista og oker antall eiendommer med 1.
     * @param eiendom Eiendommen som skal registreres
     * @return boolean Returnerer true om registreringen er gjennomfort
     */
    public boolean registrereEiendom(Eiendom eiendom){
        eiendomListe.add(eiendom);
        antallEiendommer++;
        return true;
    }

    /**
     * Finner indeksen til id-en i eiendomlista ved a soke etter id-en, lagrer da indeksen i lista som i og finnes blir true, og returnerer i.
     * @param id Tar inn id-en man vil finne indeksen til
     * @return Returnerer i som er indeksen
     * @throws IllegalArgumentException
     */
    private int finneIndeksMedId(String id) throws IllegalArgumentException{
        boolean finnes = false;
        int indeks = 0;
        for (int i = 0; i < eiendomListe.size(); i++) { // soker i lista etter id-en, ved a lage en id av hver eiendom med metoden lageIdMedIndeks
            if (lageIdMedIndeks(i).equals(id)){
                finnes = true; // Finnes registreres som true, og i lagres som indeksen hvis if setningen er riktig
                indeks = i;
            }
        }
        if (!finnes){
            throw new IllegalArgumentException("Finnes ikke");
        }
        return indeks;
    }
    public boolean sletteEiendom(String id){
        int indeks = this.finneIndeksMedId(id);
        eiendomListe.remove(indeks);
        antallEiendommer--;
        return true;
     }

    public Eiendom finnEiendommerBasertPaID(String id) throws IllegalArgumentException{
        Eiendom eiendom = null;
        for (int i = 0; i < eiendomListe.size(); i++) {
            if (lageIdMedIndeks(i).equals(id.trim())){
                eiendom = eiendomListe.get(i);
                break;
            }
        }
        if (eiendom == null){
            throw new IllegalArgumentException("Ingen eiendommer for oppgitt data");
        }
        return eiendom;
    }

    public ArrayList<Eiendom> eiendommerMedGnr(int gnr) throws IllegalArgumentException{
        boolean finnes = false;
        ArrayList<Eiendom> nyListeMedGnr = new ArrayList<>();
        for (int i = 0; i < eiendomListe.size(); i++) {
            if (eiendomListe.get(i).getGnr() == gnr){
                nyListeMedGnr.add(eiendomListe.get(i));
                finnes = true;
            }
        }
        if (!finnes){
            throw new IllegalArgumentException("Ingen eiendommer for oppgitt GNR");
        }
        return nyListeMedGnr;
    }
    public double finneGjennomsnittsAreal(){
        double sum = 0;
        for (int i = 0; i < eiendomListe.size(); i++) {
            sum += eiendomListe.get(i).getAreal();
        }
        return sum/eiendomListe.size();
    }

    public ArrayList<Eiendom> getEiendomListe() {
        return eiendomListe;
    }

    public void setEiendomListe(ArrayList<Eiendom> eiendomListe) {
        this.eiendomListe = eiendomListe;
    }

    public int getAntallEiendommer() {
        return antallEiendommer;
    }

    public void setAntallEiendommer(int antallEiendommer) {
        this.antallEiendommer = antallEiendommer;
    }
    public String lageIdMedIndeks(int indeks){
        return eiendomListe.get(indeks).getKommunenummer()+"-"+eiendomListe.get(indeks).getGnr()+"/"+eiendomListe.get(indeks).getBnr();
    }

    @Override
    public String toString() {
        return "EiendomRegister:" +
                "eiendomListe:" + eiendomListe +
                "\nantallEiendommer:" + antallEiendommer;
    }
}
