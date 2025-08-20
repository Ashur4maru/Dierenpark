import java.time.LocalDate;

public class Bezoekers extends Persoon {

    private String bezoekerID;

    public Bezoekers(LocalDate geboortedatum, String adresse, String naam, String bezoekerID) {
        super(geboortedatum, adresse, naam);
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
        return super.toString() +
                "\nBezoeker ID: " + bezoekerID;
    }
}
