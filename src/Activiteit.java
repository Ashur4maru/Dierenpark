import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Activiteit {
    private String naam;
    private String beschrijving;
    private LocalDateTime starttijd;
    private LocalDateTime eindtijd;
    private Personeel verantwoordelijke;
    private List<Bezoeker> deelnemers;
    private int maxDeelnemers;

    public Activiteit(String naam, String beschrijving, LocalDateTime starttijd,
                      LocalDateTime eindtijd, Personeel verantwoordelijke, int maxDeelnemers) {
        this.naam = naam;
        this.beschrijving = beschrijving;
        this.starttijd = starttijd;
        this.eindtijd = eindtijd;
        this.verantwoordelijke = verantwoordelijke;
        this.maxDeelnemers = maxDeelnemers;
        this.deelnemers = new ArrayList<>();
    }

    // Getters en setters


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public LocalDateTime getStarttijd() {
        return starttijd;
    }

    public void setStarttijd(LocalDateTime starttijd) {
        this.starttijd = starttijd;
    }

    public LocalDateTime getEindtijd() {
        return eindtijd;
    }

    public void setEindtijd(LocalDateTime eindtijd) {
        this.eindtijd = eindtijd;
    }

    public Personeel getVerantwoordelijke() {
        return verantwoordelijke;
    }

    public void setVerantwoordelijke(Personeel verantwoordelijke) {
        this.verantwoordelijke = verantwoordelijke;
    }

    public List<Bezoeker> getDeelnemers() {
        return deelnemers;
    }

    public void setDeelnemers(List<Bezoeker> deelnemers) {
        this.deelnemers = deelnemers;
    }

    public int getMaxDeelnemers() {
        return maxDeelnemers;
    }

    public void setMaxDeelnemers(int maxDeelnemers) {
        this.maxDeelnemers = maxDeelnemers;
    }

    public boolean voegDeelnemerToe(Bezoeker bezoekers) {
        if (deelnemers.size() < maxDeelnemers) {
            deelnemers.add(bezoekers);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Activiteit: " + naam +
                "\nBeschrijving: " + beschrijving +
                "\nTijd: " + starttijd + " tot " + eindtijd +
                "\nVerantwoordelijke: " + verantwoordelijke.getNaam() +
                "\nDeelnemers: " + deelnemers.size() + "/" + maxDeelnemers;
    }
}
