package org.example;

import java.util.Objects;

/**
 * <h1>Eiendom klassen</h1>
 * Klasse med alt av info en eiendom skal inneholde, samt get og set metoder, equals metode og toString metode.
 * @author Mikael Stray Froyshov
 * @version 1.0
 * @since 2023-07-02
 */
public class Eiendom {
    private String kommunenavn;
    private int kommunenummer;
    private int gnr;
    private int bnr;
    private String navn;
    private double areal;
    private String eierNavn;

    /**
     *
     * @param kommunenavn Kommunenavnet
     * @param kommunenummer Kommunenummeret
     * @param gnr Gardsnummer
     * @param bnr Bruksnummer
     * @param navn Navn
     * @param areal Arealet
     * @param eierNavn Eiernavnet
     */
    public Eiendom(String kommunenavn, int kommunenummer, int gnr, int bnr, String navn, double areal, String eierNavn) {
        this.kommunenavn = kommunenavn;
        this.kommunenummer = kommunenummer;
        this.gnr = gnr;
        this.bnr = bnr;
        this.navn = navn;
        this.areal = areal;
        this.eierNavn = eierNavn;
    }

    /**
     * Get metode
     * @return String returnerer kommunenavnet
     */
    public String getKommunenavn() {
        return kommunenavn;
    }

    public int getKommunenummer() {
        return kommunenummer;
    }

    public int getGnr() {
        return gnr;
    }

    public int getBnr() {
        return bnr;
    }

    public String getNavn() {
        return navn;
    }

    public double getAreal() {
        return areal;
    }

    public String getEierNavn() {
        return eierNavn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAreal(double areal) {
        this.areal = areal;
    }

    public void setEierNavn(String eierNavn) {
        this.eierNavn = eierNavn;
    }
    public String lageId(int kommunenummer, int gnr, int bnr){
        return kommunenummer+"-"+gnr+"/"+bnr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Eiendom eiendom)) return false;
        return getKommunenummer() == eiendom.getKommunenummer() && getGnr() == eiendom.getGnr() && getBnr() == eiendom.getBnr() && Objects.equals(getKommunenavn(), eiendom.getKommunenavn());
    }

    @Override
    public String toString() {
        return "\n -Eiendom:\n" +
                "kommunenavn:'" + kommunenavn + '\'' +
                ", kommunenummer:" + kommunenummer +
                ", gnr:" + gnr +
                ", bnr:" + bnr +
                ", navn:'" + navn + '\'' +
                ", areal:" + areal +
                ", eierNavn:'" + eierNavn + '\''+"\n";
    }
}
