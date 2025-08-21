import java.time.LocalDate;

public class Personeel extends Persoon{

    private String personeelsnummer;
    private String functie;

    public Personeel(String naam, String adresse, LocalDate geboortedatum, String personeelsnummer, String functie) {
        super(naam, adresse, geboortedatum);
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
                "\nFunctie: " + functie + "\n----------------------"; // Voeg functie toe aan de stringrepresentatie
    }
}
