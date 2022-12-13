package booktypes;

public class EBook extends Book {

    private String version;

    public EBook(String titel, String typ, double preis, int auflage, String version) {
        super(titel, typ, preis, auflage);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
