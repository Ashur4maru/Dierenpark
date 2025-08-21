public class Tour {

    private String naam;

    public Tour(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "naam='" + naam + '\'' +
                '}';
    }
}
