import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu{

    private List<Bezoeker>bezoekerLijst;
    private List<Personeel>personeellijst;
    private Scanner scanner;

    public Menu(){
        bezoekerLijst = new ArrayList<>();
        personeellijst = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void start(){

        while(true){
            System.out.println("\n========= Menu =========");
            System.out.println("1. Aanmaken Personeelsleden");
            System.out.println("2. Aanmaken Bezoeker");
            System.out.println("3. Aanmaken Activiteit");
            System.out.println("4. Aanmaken Tour");
            System.out.println("5. Lijst Personeelsleden");
            System.out.println("6. Lijst Bezoekers");
            System.out.println("7. Registreren Bezoeker aan tour");
            System.out.println("8. Toewijzen van Personeelsleden");
            System.out.println("9. Tour info printen");
            System.out.println("0. Afsluiten");
            System.out.print("Keuze: ");
            int keuze = Integer.parseInt(scanner.nextLine());

            switch(keuze){
                case 1: maakPersoneel();
                    break;
                case 2: maakBezoeker();
                    break;
                case 0: System.exit(0);
                default:
                    System.out.println("Ongeldige Keuze");
            }
        }
    }

    public void maakPersoneel(){
        System.out.println("Naam: ");
        String naam = scanner.nextLine();

        System.out.println("Adresse: ");
        String adresse = scanner.nextLine();

        System.out.println("Geboortedatum (dd-mm-yyyy): ");
        LocalDate geboortedatum = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.println("Personeelsnummer");
        String personeelsnummer = scanner.nextLine();

        System.out.println("Functie: ");
        String functie = scanner.nextLine();

        Personeel personeel = new Personeel(naam, adresse ,  geboortedatum, personeelsnummer, functie);
        personeellijst.add(personeel);
        System.out.println("Personeel aangemaakt");

    }

    public void maakBezoeker(){
        System.out.println("Naam: ");
        String naam = scanner.nextLine();

        System.out.println("Adresse: ");
        String adresse = scanner.nextLine();

        System.out.println("Geboortedatum (dd-mm-yyyy): ");
        LocalDate geboortedatum = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.println("Bezoeked ID: ");
        String bezoekedId = scanner.nextLine();

        Bezoeker bezoeker = new Bezoeker(naam, adresse, geboortedatum, bezoekedId);
        bezoekerLijst.add(bezoeker);
        System.out.println("Bezoeker aangemaken");
    }
}