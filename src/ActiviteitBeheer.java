import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActiviteitBeheer {
    private List<Activiteit> activiteiten;
    private PersoonBeheer persoonBeheer;

    public ActiviteitBeheer(PersoonBeheer persoonBeheer) {
        this.activiteiten = new ArrayList<>();
        this.persoonBeheer = persoonBeheer;
    }

    public void voegActiviteitToe(Activiteit activiteit) {
        activiteiten.add(activiteit);
    }

    public List<Activiteit> getActiviteiten() {
        return new ArrayList<>(activiteiten);
    }

    public boolean schrijfInVoorActiviteit(int activiteitIndex, String bezoekersNaam) {
        if (activiteitIndex >= 0 && activiteitIndex < activiteiten.size()) {
            Activiteit activiteit = activiteiten.get(activiteitIndex);

            for (Bezoeker p : persoonBeheer.getBezoekers()) {
                if (p instanceof Bezoeker && p.getNaam().equalsIgnoreCase(bezoekersNaam)) {
                    return activiteit.voegDeelnemerToe((Bezoeker)p);
                }
            }
        }
        return false;
    }
}

