
import java.util.GregorianCalendar;
public class ArbTaker {

    private Person personalia;
    private int arbTakernr;
    private int ansettelsesår;
    private double månedslønn;
    private double skatteprosent;

    public ArbTaker(Person personalia, int arbTakernr, int ansettelsesår, double månedslønn, double skatteprosent) {
        this.personalia = personalia;
        this.arbTakernr = arbTakernr;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent;
    }


    java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
    private int ar = kalender.get(kalender.YEAR);
    private int maned = kalender.get(kalender.MONTH)+1;

    public void setManed(int maned) {
        this.maned = maned;
    }
    public Person getPersonalia() {
        return personalia;
    }

    public int getArbTakernr() {
        return arbTakernr;
    }

    public int getAnsettelsesår() {
        return ansettelsesår;
    }

    public double getMånedslønn() {
        return månedslønn;
    }

    public double getSkatteprosent() {
          if (maned == 6){
            return 0;
        }
          if (maned == 12) {
            return skatteprosent/2;
        } else {
            return skatteprosent;
        }
    }

    public void setArbTakernr(int arbTakernr) {
        this.arbTakernr = arbTakernr;
    }

    public void setAnsettelsesår(int ansettelsesår) {
        this.ansettelsesår = ansettelsesår;
    }

    public void setMånedslønn(double månedslønn) {
        this.månedslønn = månedslønn;
    }

    public void setSkatteprosent(double skatteprosent) {
        this.skatteprosent = skatteprosent;
    }

    @Override
    public String toString() {
        return  personalia +
                "\n arbTakernr:" + arbTakernr +
                "\n ansettelsesår:" + ansettelsesår +
                "\n månedslønn:" + månedslønn +
                "\n skatteprosent:" + skatteprosent;
    }

    public double skatteTrekk(){
        double skatteTrekkNr = getSkatteprosent()/100;
        return getMånedslønn()*skatteTrekkNr;
    }
    public double bruttoLonn(){
        return getMånedslønn()-skatteTrekk();
    }

    public double arligSkattetrekk(){
        return skatteTrekk()*10.5;
    }
    public String navnForm(){
        return personalia.getFornavn() +" "+ personalia.getEtternavn();
    }
    public int alder(){
        return ar-personalia.getFodselsar();
    }
    public int arIBedriften(){
        return ar-getAnsettelsesår();
    }
    public boolean ansattMer(int ar){
        if (arIBedriften() > ar){
            return true;
        } else {
            return false;
        }
    }

}
