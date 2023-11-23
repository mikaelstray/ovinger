import java.util.Arrays;

public class OppgaveOversikt {

    private Student[] studenter = new Student[1];
    private int antStud = 0;

    public boolean registrerNyStud(String navn, int antOpg) {
        if (antStud == studenter.length){
            utvidTabell();
        }
        studenter[antStud] = new Student(navn, antOpg);
        antStud++;
        return true;
    }

    public void utvidTabell(){
        Student[] nyTabell = new Student[studenter.length + 2];
        for (int i = 0; i < studenter.length; i++) {
            nyTabell[i] = studenter[i];
        }
        studenter = nyTabell;
    }


    public int antallStudenter(){
        return antStud;
    }

    public int bestemtOpgantall(String navn) throws IllegalArgumentException{
        int antallOpg = 0;
        boolean finnesIkke = false;
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn.trim())){
                antallOpg = studenter[i].getAntOpg();
                finnesIkke = true;
            }
        }
        if (!finnesIkke){
            throw new IllegalArgumentException("Navn finnes ikke");
        }
        return antallOpg;
    }
    public int okOpg(int indeks, int oking){
        studenter[indeks].okOpg(oking);
        return studenter[indeks].getAntOpg();
    }

    public String toString() {
        String utskrift = "";
        for (int i = 0; i < antallStudenter(); i++) {
            utskrift += studenter[i].toString();
        }
        return utskrift;
    }
}