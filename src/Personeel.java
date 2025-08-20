import java.util.Date;

public class Personeel extends Persoon{

    public String functie;

    public Personeel(Date geboortedatum, String adresse, String name, String functie) {
        super(geboortedatum, adresse, name);
        this.functie = functie;
    }
}
