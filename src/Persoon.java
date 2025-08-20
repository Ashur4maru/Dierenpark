import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Persoon {

    public  String naam;
    public String adresse;
    public LocalDate geboortedatum;
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Persoon(LocalDate geboortedatum, String adresse, String name) {
        this.geboortedatum = geboortedatum;
        this.adresse = adresse;
        this.naam = naam;
    }

    public String getName() {
        return naam;
    }

    public void setName(String name) {
        this.naam = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    @Override
    public String toString() {
        return "Naam: " + naam +
                "\nAdres: " + adresse +
                "\nGeboortedatum: " + geboortedatum.format(DATE_FORMATTER) +
                "\n----------------------";
    }
}
