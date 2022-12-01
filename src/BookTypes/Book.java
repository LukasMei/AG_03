package BookTypes;

public class Book {
    private String titel;
    private String typ;
    private double preis;
    private int auflage;



    public Book(String titel, String typ, double preis, int auflage) {
        this.titel = titel;
        this.typ = typ;
        this.preis = preis;
        this.auflage = auflage;

    }
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {

        this.titel = titel;
    }

    public String getTyp() {

        return typ;
    }

    public void setTyp(String typ) {

        this.typ = typ;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {

        this.preis = preis;
    }

    public int getAuflage() {

        return auflage;
    }

    public void setAuflage(int auflage) {
        this.auflage = auflage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titel='" + titel + '\'' +
                ", typ='" + typ + '\'' +
                ", preis=" + preis +
                ", auflage=" + auflage +
                '}';
    }
}
