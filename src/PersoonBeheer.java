import java.util.ArrayList;
import java.util.List;

public class PersoonBeheer {

    private List<Personeel> personeelsleden;
    private List<Bezoeker>  bezoekers;

    public PersoonBeheer(List<Personeel> personeelsleden, List<Bezoeker> bezoekers) {
        this.personeelsleden = personeelsleden;
        this.bezoekers = bezoekers;
    }

    public List<Personeel> getPersoneelsleden() {
        return personeelsleden;
    }

    public void setPersoneelsleden(List<Personeel> personeelsleden) {
        this.personeelsleden = personeelsleden;
    }

    public List<Bezoeker> getBezoekers() {
        return bezoekers;
    }

    public void setBezoekers(List<Bezoeker> bezoekers) {
        this.bezoekers = bezoekers;
    }

    //Toevoegen van Personeel en Bezoekers

    public void voegPersoneelToe(Personeel personeel) {
        personeelsleden.add(personeel);
    }

    public void voegBezoekerToe(Bezoeker bezoeker){
        bezoekers.add(bezoeker);
    }

    //Verwijderen van Personeel en Bezoekers

    public boolean verwijderenPersoneel(int index) {
        if(index >= 0 && index < personeelsleden.size()){
            personeelsleden.remove(index);
            return true;
        }
        return false;
    }

    public boolean verwijderenBezoeker(int index) {
        if(index >= 0 && index < bezoekers.size()){
            bezoekers.remove(index);
            return true;
        }
        return false;
    }

}
