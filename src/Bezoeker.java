import java.time.LocalDate;

public class Bezoeker extends Persoon {

    private String bezoekerID;

    public Bezoeker(String naam, String adresse, LocalDate geboortedatum, String bezoekerID) {
        super(naam, adresse, geboortedatum);
        this.bezoekerID = bezoekerID;
    }

    public String getBezoekerID() {
        return bezoekerID;
    }

    public void setBezoekerID(String bezoekerID) {
        this.bezoekerID = bezoekerID;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBezoeker ID: " + bezoekerID + "\n----------------------";
    }
}
