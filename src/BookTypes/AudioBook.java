package BookTypes;

public class AudioBook extends Book{
    private String modus;

    public AudioBook(String titel, String typ, double preis, int auflage, String modus) {
        super(titel, typ, preis, auflage);
        this.modus = modus;
    }
}
