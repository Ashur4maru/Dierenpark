# Dierenpark

Dit project simuleert de werking van een dierenpark, met een focus op personen, activiteiten, tours, zones én dieren. Alle variabelen die personen voorstellen hebben een naamvariant op "betrapt". De applicatie ondersteunt beheer en raadpleging van dieren, plattegrondnavigatie en foutafhandeling.

> Let op: Voor de ontwikkeling van dit project zijn AI-tools gebruikt om het schrijven, genereren en/of optimaliseren van code, documentatie en andere inhoud te ondersteunen.

## Inhoud

- [Beschrijving](#beschrijving)
- [Structuur](#structuur)
- [Functionaliteiten](#functionaliteiten)
- [User Stories](#user-stories)
- [Voorbeeldmenu](#voorbeeldmenu)
- [Installatie & Gebruik](#installatie--gebruik)
- [Auteurs](#auteurs)

---

## Beschrijving

In Dierenpark komen verschillende soorten personen samen: bezoekers en personeelsleden (zoals gidsen, verzorgers en poetsploeg). Bezoekers worden opgedeeld in leeftijdscategorieën (-12, kinderen, volwassenen, senioren).

Zones in het park hebben een maximumcapaciteit en een unieke lijst van activiteiten, zoals "dierenveld", "eetstand" en "aquarium". Tours door het park zijn gekoppeld aan specifieke leeftijdscategorieën en worden begeleid door personeelsleden.

Naast personen en zones zijn er dieren, die door bezoekers en beheerders kunnen worden geraadpleegd en beheerd. Dieren zijn gekoppeld aan een verblijf en hebben eigenschappen zoals naam, soort, leefgebied en voeding.

Alle variabelen die personen voorstellen hebben een naamvariant op "betrapt" (bijvoorbeeld: `betrapteNaam`, `betrapteGeboortedatum`, `betraptAdres`, etc.).

## Structuur

De applicatie bestaat uit de volgende hoofdklassen:

- **BetraptPersoon** (abstract)
  - **BetraptBezoeker** (ingedeeld in leeftijdscategorieën)
  - **BetraptPersoneelslid** (met subtypes: gids, verzorger, poetser, ...)
- **BetraptZone** (met capaciteit en unieke activiteiten)
- **BetraptActiviteit** (categorie, naam, omschrijving)
- **BetraptTour** (leeftijdsselectie, medewerkers, ingeschreven bezoekers)
- **BetraptDier** (naam, soort, leeftijd, leefgebied, voeding, verblijf)
- **BetraptPlattegrond** (visuele weergave van zones/verblijven en koppeling met dieren)

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

8. **Overzicht van dieren**  
   Toon een lijst van alle aanwezige dieren in het park, met mogelijkheid om per dier detailinformatie te bekijken.

9. **Toevoegen van nieuw dier (beheerder)**  
   Voeg een nieuw dier toe met verplichte velden: naam, soort, leeftijd, leefgebied, voeding en verblijf. Foutmeldingen bij ongeldige invoer.

10. **Raadplegen plattegrond**  
    Toon een visuele plattegrond van het dierenpark. Alle dierenverblijven zijn duidelijk aangeduid en klikbaar; bij klikken verschijnt info over de dieren in dat verblijf. Plattegrond werkt op desktop en mobiel.

### Foutcontroles

- Controleer of een zone niet over de maximumcapaciteit gaat.
- Controleer of een activiteit niet dubbel wordt toegevoegd aan een zone.
- Controleer of een bezoeker in de juiste leeftijdscategorie zit voor een tour.
- Controleer of medewerkers en bezoekers niet dubbel worden toegevoegd.
- Valideer invoervelden bij toevoegen van een nieuw dier; toon foutmeldingen bij ongeldige/ontbrekende data.

## User Stories

### User Story 1
**Als bezoeker wil ik informatie kunnen zien over de verschillende dieren in het dierenpark, zodat ik meer kan leren over hun leefgewoonten en kenmerken.**

- Een overzichtspagina toont een lijst van alle aanwezige dieren.
- Bij elk dier kan ik klikken en gedetailleerde informatie zien (zoals naam, soort, leefgebied, voeding).
- De getoonde informatie is up-to-date en accuraat.

---

### User Story 2
**Als beheerder wil ik nieuwe dieren kunnen toevoegen aan het systeem, zodat het aanbod van dieren up-to-date blijft en bezoekers altijd actuele informatie zien.**

- Er is een invoerpagina voor het toevoegen van een nieuw dier.
- Velden voor naam, soort, leeftijd, leefgebied en voeding zijn verplicht.
- Na toevoeging verschijnt het dier direct in het overzicht voor bezoekers.
- Foutmeldingen verschijnen bij ontbrekende of ongeldige invoer.

---

### User Story 3
**Als bezoeker wil ik een plattegrond van het dierenpark kunnen raadplegen, zodat ik gemakkelijk kan navigeren en alle dieren kan vinden die ik wil bekijken.**

- Er is een visuele plattegrond beschikbaar via het menu of de homepage.
- Op de plattegrond staan alle dierenverblijven duidelijk aangeduid en klikbaar.
- Bij het klikken op een verblijf krijg ik informatie over de dieren in dat verblijf.
- De plattegrond werkt op zowel desktop als mobiel.

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
10. Overzicht dieren
11. Toevoegen nieuw dier
12. Plattegrond raadplegen
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
