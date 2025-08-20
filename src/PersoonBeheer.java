import java.util.ArrayList;

public class PersoonBeheer {

    private ArrayList<Persoon> personen;

    public PersoonBeheer() {
        personen = new ArrayList<>();
    }

    public void voegpersonen(Persoon persoon) {
        personen.add(persoon);
    }

    public boolean verwijderenPersoon(int index){
        if (index >= 0 && index < personen.size()){
            personen.remove(index);
            return true;
        }
        return false;
    }

    public ArrayList<Persoon> getPersonen() {
        return personen;
    }

    public void setPersonen(ArrayList<Persoon> personen) {
        this.personen = personen;
    }

    public ArrayList<Persoon> zoekPersonen(String zoekterm) {
        ArrayList<Persoon> resultaten = new ArrayList<>();
        String lowerZoekterm = zoekterm.toLowerCase();

        for (Persoon p : personen) {
            if (p.getNaam().toLowerCase().contains(lowerZoekterm)) {
                resultaten.add(p);
            }
        }
        return resultaten;
    }
}
