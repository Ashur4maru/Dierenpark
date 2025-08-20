import java.time.LocalDate;
import java.util.Date;

public class Personeel extends Persoon{

    private String personeelsnummer;
    private String functie;

    public Personeel(LocalDate geboortedatum, String adresse, String name, String personeelsnummer,String functie) {
        super(geboortedatum, adresse, name);
        this.personeelsnummer = personeelsnummer;
        this.functie = functie;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public String getPersoneelsnummer() {
        return personeelsnummer;
    }

    public void setPersoneelsnummer(String personeelsnummer) {
        this.personeelsnummer = personeelsnummer;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPersoneelsnummer: " + personeelsnummer +
                "\nFunctie: " + functie; // Voeg functie toe aan de stringrepresentatie
    }
}
