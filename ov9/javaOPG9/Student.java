import java.util.Objects;

public class Student {

    private final String navn;
    private int antOpg;

    public Student(String navn, int antOpg) {
        if (navn == null || navn.trim().equals("")){
            throw new IllegalArgumentException("Ma oppgis");
        }
        this.navn = navn.trim();
        this.antOpg = antOpg;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntOpg() {
        return antOpg;
    }

    public void okOpg(int oking) {
        if (oking < 0){
            throw new IllegalArgumentException("Oking ma vare storre enn 0");
        }
        antOpg += oking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getAntOpg() == student.getAntOpg() && Objects.equals(getNavn(), student.getNavn());
    }

    @Override
    public String toString() {
        return "\nNavn: " + navn +
                ", antOpg:" + antOpg;
    }
}
