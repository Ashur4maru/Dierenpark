# Dierenpark

Dit project simuleert de werking van een dierenpark, met een focus op personen, activiteiten, tours en zones. Alle variabelen die personen voorstellen hebben een naamvariant op "betrapt". De applicatie is bedoeld als oefening in objectgeoriënteerd programmeren (Java).

> Let op: Voor de ontwikkeling van dit project zijn AI-tools gebruikt om het schrijven, genereren en/of optimaliseren van code, documentatie en andere inhoud te ondersteunen.

## Inhoud

- [Beschrijving](#beschrijving)
- [Structuur](#structuur)
- [Functionaliteiten](#functionaliteiten)
- [Voorbeeldmenu](#voorbeeldmenu)
- [Installatie & Gebruik](#installatie--gebruik)
- [Auteurs](#auteurs)

---

## Beschrijving

In Dierenpark komen verschillende soorten personen samen: bezoekers en personeelsleden (zoals gidsen, verzorgers en poetsploeg). Bezoekers worden opgedeeld in leeftijdscategorieën (-12, kinderen, volwassenen, 65+), wat invloed heeft op toegangsprijzen en activiteiten.

Zones in het park hebben een maximumcapaciteit en een unieke lijst van activiteiten, zoals "dierenveld", "eetstand" en "aquarium". Tours door het park zijn gekoppeld aan specifieke leeftijdscategorieën en medewerkers, en bezoekers kunnen zich inschrijven. Activiteiten worden voorzien van een naam, categorie en omschrijving (met inspiratie uit echte dierenparken).

Alle variabelen die personen voorstellen hebben een naamvariant op "betrapt" (bijvoorbeeld: `betrapteNaam`, `betrapteGeboortedatum`, `betraptAdres`, etc.).

## Structuur

De applicatie bestaat uit de volgende hoofdklassen:

- **BetraptPersoon** (abstract)
  - **BetraptBezoeker** (ingedeeld in leeftijdscategorieën)
  - **BetraptPersoneelslid** (met subtypes: gids, verzorger, poetser, ...)
- **BetraptZone** (met capaciteit en unieke activiteiten)
- **BetraptActiviteit** (categorie, naam, omschrijving)
- **BetraptTour** (leeftijdsselectie, medewerkers, ingeschreven bezoekers)

## Functionaliteiten

Bij het starten van de applicatie verschijnt een keuzemenu met de volgende opties:

1. **Aanmaken nieuwe personeelsleden**  
   Voeg een nieuw personeelslid toe met naam, geboortedatum en adres.

2. **Aanmaken activiteiten**  
   Creëer een nieuwe activiteit met naam, categorie en omschrijving.

3. **Aanmaken tours**  
   Maak een nieuwe tour aan met alle nodige informatie.

4. **Registreren van een bezoeker**  
   Voeg een nieuwe bezoeker toe en wijs deze toe aan een leeftijdscategorie.

5. **Toewijzen personeel aan activiteit**  
   Voeg een personeelslid toe aan een activiteit.

6. **Inschrijving bezoeker aan tour**  
   Schrijf een bezoeker in voor een tour.

7. **Print tourinfo**  
   Maak een tekstbestand aan met de bezoekerslijst van een tour.

### Foutcontroles

- Controleer of een zone niet over de maximumcapaciteit gaat.
- Controleer of een activiteit niet dubbel wordt toegevoegd aan een zone.
- Controleer of een bezoeker in de juiste leeftijdscategorie zit voor een tour.
- Controleer of medewerkers en bezoekers niet dubbel worden toegevoegd.

## Voorbeeldmenu

```
Welkom in het Dierenpark!
Kies een optie:
1. Aanmaken Personeelsleden
2. Aanmaken Bezoeker
3. Aanmaken Activiteit
4. Aanmaken Tour
5. Lijst Personeelsleden
6. Lijst Bezoekers
7. Registreren Bezoeker aan tour
8. Toewijzen van Personeelsleden
9. Tour info printen
0. Afsluiten
```

## Installatie & Gebruik

1. Clone deze repository:
   ```
   git clone https://github.com/Ashur4maru/Dierenpark.git
   ```
2. Compileer de Java-bestanden:
   ```
   javac src/*.java
   ```
3. Start de applicatie:
   ```
   java src/Main
   ```

## Auteurs

- Ontwikkelaar: Rakim Benkirane

