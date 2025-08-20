import java.util.Date;

public class Persoon {

    public  String name;
    public String adresse;
    public Date geboortedatum;

    public Persoon(Date geboortedatum, String adresse, String name) {
        this.geboortedatum = geboortedatum;
        this.adresse = adresse;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }
}
