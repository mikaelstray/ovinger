package org.example;

import java.util.Objects;

public class Arrangement {

    private final int nummer;
    private String navn;
    private String sted;
    private String arrangor;
    private String type;
    private long klokkeslett;

    public Arrangement(int nummer, String navn, String sted, String arrangor, String type, long klokkeslett) {
        this.nummer = nummer;
        this.navn = navn;
        this.sted = sted;
        this.arrangor = arrangor;
        this.type = type;
        this.klokkeslett = klokkeslett;
    }

    public int getNummer() {
        return nummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    public String getArrangor() {
        return arrangor;
    }

    public void setArrangor(String arrangor) {
        this.arrangor = arrangor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getKlokkeslett() {
        return klokkeslett;
    }

    public void setKlokkeslett(long klokkeslett) {
        this.klokkeslett = klokkeslett;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Arrangement that)) return false;
        return getNummer() == that.getNummer() && getKlokkeslett() == that.getKlokkeslett() && Objects.equals(getNavn(), that.getNavn()) && Objects.equals(getSted(), that.getSted()) && Objects.equals(getArrangor(), that.getArrangor()) && Objects.equals(getType(), that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNummer(), getNavn(), getSted(), getArrangor(), getType(), getKlokkeslett());
    }

    @Override
    public String toString() {
        return "Arrangement{" +
                "nummer=" + nummer +
                ", navn='" + navn + '\'' +
                ", sted='" + sted + '\'' +
                ", arrangor='" + arrangor + '\'' +
                ", type='" + type + '\'' +
                ", klokkeslett=" + klokkeslett +
                '}';
    }
}
