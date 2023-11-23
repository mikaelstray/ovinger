import java.util.Arrays;

public class String2Class {

    private String teksten;

    public String2Class(String teksten) {
        this.teksten = teksten;
    }

    public String getTeksten() {
        return teksten;
    }

    public String[] nyeLista(){
        return teksten.split(" ");
    }
    public int finneOrd(){
        String[] nyListe = teksten.split(" ");
        return nyListe.length;
    }

    public double lengdeOrd(){
        double sumen = 0;
        for (int i = 0; i < nyeLista().length; i++) {
            sumen += nyeLista()[i].length();
        }
        return sumen/finneOrd();
    }

    public String bytteOrd(String gammel, String ny){
        String nyListe = teksten.replace(gammel,ny);
        return nyListe;
    }

    public String toUpper(){
        String nyListe = teksten.toUpperCase();
        return nyListe;
    }

    public void periode() {
        int antallTegn = 0;
        String[] tegn = {"!",".","?",":"};
        String[] nyListe = teksten.split(" ");

        int sumen = 0;
        int totalSumen = 0;
        int[] endelig = new int[nyListe.length];
        for (int i = 0; i < nyListe.length; i++) {
           sumen++;
           totalSumen++;
            for (int j = 0; j < tegn.length; j++) {
                if (nyListe[i].contains(tegn[j])){
                    antallTegn++;
                    endelig[i] = sumen;
                    sumen = 0;
                }
            }
        }
        System.out.println("Det var "+(antallTegn+1)+ " perioder. Gjennomsnittet ble " +(double)totalSumen/(antallTegn+1));
    }
    public void periode2 (){
        System.out.println("" + (double) (teksten.split(" ",0).length)/teksten.split("[!?.:]").length);
    }
}
