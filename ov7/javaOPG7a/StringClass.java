import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class StringClass {

    private String teksten;

    public StringClass(String teksten) {
        this.teksten = teksten;
    }

    public String getTeksten() {
        return teksten;
    }

    public char[] forsteChar(){
        String ord[] = teksten.split(" ");
        char[] ferdigTabell = new char[ord.length];
        for (int i = 0; i < ord.length; i++) {
            ferdigTabell[i] = ord[i].charAt(0);
        }
        return ferdigTabell;
    }

    public ArrayList konvertereTilListe(){
        ArrayList<Character> nyListe = new ArrayList<>();
        for (int i = 0; i < teksten.length(); i++) {
            nyListe.add(teksten.charAt(i));
        }
        return nyListe;
    }
    public void fjerneChar(String karakter) {
        String nyListe = teksten.replace(karakter,"");
        System.out.println(nyListe);
    }

}
