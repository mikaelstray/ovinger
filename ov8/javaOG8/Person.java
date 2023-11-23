import java.util.Objects;

public class Person {

    private final String fornavn;
    private final String etternavn;
    private final int fodselsar;
    private final double toleranse = 0.001;

    public Person(String fornavn, String etternavn, int fodselsar) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsar = fodselsar;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public int getFodselsar() {
        return fodselsar;
    }

    @Override
    public String toString() {
        return "fornavn:'" + fornavn + '\'' +
                "\n etternavn:'" + etternavn + '\'' +
                "\nfodselsar:" + fodselsar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getFodselsar() == person.getFodselsar() && Objects.equals(getFornavn(), person.getFornavn()) && Objects.equals(getEtternavn(), person.getEtternavn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFornavn(), getEtternavn(), getFodselsar());
    }
}

