import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {
    private PersoonBeheer beheer;
    private Scanner scanner;
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Menu() {
        this.beheer = new PersoonBeheer();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        toonHoofdMenu();
    }

    private void toonHoofdMenu() {
        while (true) {
            System.out.println("\n========= PERSONENBEHEER =========");
            System.out.println("1. Nieuwe bezoeker toevoegen");
            System.out.println("2. Nieuwe personeelslid toevoegen");
            System.out.println("3. Personen overzicht");
            System.out.println("4. Persoon zoeken");
            System.out.println("5. Persoon verwijderen");
            System.out.println("6. Afsluiten");
            System.out.print("Keuze: ");

            int keuze = Integer.parseInt(scanner.nextLine());

            switch (keuze) {
                case 1: voegBezoekerToe(); break;
                case 2: voegPersoneelslidToe(); break;
                case 3: toonPersonen(); break;
                case 4: zoekPersoon(); break;
                case 5: verwijderPersoon(); break;
                case 6: System.exit(0);
                default: System.out.println("Ongeldige keuze!");
            }
        }
    }

    private void voegBezoekerToe() {
        System.out.print("Naam: ");
        String naam = scanner.nextLine();

        System.out.print("Adres: ");
        String adres = scanner.nextLine();

        System.out.print("Geboortedatum (dd-mm-jjjj): ");
        LocalDate geboortedatum = LocalDate.parse(scanner.nextLine(), DATE_FORMATTER);

        System.out.print("Bezoeker ID: ");
        String bezoekerID = scanner.nextLine();

        beheer.voegpersonen(new Bezoekers(geboortedatum, adres, naam, bezoekerID));
        System.out.println("Bezoeker toegevoegd!");
    }

    private void voegPersoneelslidToe() {
        System.out.print("Naam: ");
        String naam = scanner.nextLine();

        System.out.print("Adres: ");
        String adresse = scanner.nextLine();

        System.out.print("Geboortedatum (dd-mm-jjjj): ");
        LocalDate geboortedatum = LocalDate.parse(scanner.nextLine(), DATE_FORMATTER);

        System.out.print("Personeelsnummer: ");
        String personeelsnummer = scanner.nextLine();

        System.out.print("Functie: "); // Vraag naar functie
        String functie = scanner.nextLine();

        beheer.voegpersonen(new Personeel(geboortedatum, adresse, naam, personeelsnummer, functie));
        System.out.println("Personeelslid toegevoegd!");
    }

    private void toonPersonen() {
        System.out.println("\n--- PERSONENLIJST ---");
        beheer.getPersonen().forEach(System.out::println);
    }

    private void zoekPersoon() {
        System.out.print("Zoekterm: ");
        String term = scanner.nextLine();
        beheer.zoekPersonen(term).forEach(System.out::println);
    }

    private void verwijderPersoon() {
        toonPersonen();
        System.out.print("Index van te verwijderen persoon: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (beheer.verwijderenPersoon(index)) {
            System.out.println("Persoon verwijderd!");
        } else {
            System.out.println("Ongeldige index!");
        }
    }
}
