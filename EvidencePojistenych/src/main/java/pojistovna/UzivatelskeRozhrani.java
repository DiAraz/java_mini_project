package pojistovna;

import java.util.Scanner;

/**
 * Tato třída reprezentuje uživatelské rozhraní
 */
public class UzivatelskeRozhrani {

    /**
     * Vytvoření objektů
     */
    Scanner scanner = new Scanner(System.in, "UTF8");
    EvidencePojistenych evidencePojistenych = new EvidencePojistenych();

    /**
     * Vypíše informační obrazovku
     */
    public void vypisUvodniObrazovku() {
        System.out.println("_____________________________");
        System.out.println("Evidence pojištěných");
        System.out.println("=============================");
        System.out.printf("%nVyberte si akci:%n" +
                "1 - Přidat nového pojištěného%n" +
                "2 = Vypsat všechny pojištěné%n" +
                "3 = Vyhledat pojištěného%n" +
                "4 = Konec%n");
    }

    /**
     * Zpracuje přidání pojištěného
     */
    public void pridejPojistneho() {

        System.out.println("\nZadejte jméno pojisteného:");
        // Validace jména je nastavená bez možností prázdného vstupu
        String jmeno = scanner.nextLine();
        while (jmeno.isEmpty()) {
            System.out.println("Zadejte platné jméno");
            jmeno = scanner.nextLine();
        }

        System.out.println("Zadejte příjmení:");
        // Validace příjmení je nastavená bez možností prázdného vstupu
        String prijmeni = scanner.nextLine();
        while (prijmeni.isEmpty()) {
            System.out.println("Zadejte platné příjmení");
            prijmeni = scanner.nextLine();
        }

        System.out.println("Zadejte telefonní číslo:");
        String telefon = scanner.nextLine();

        System.out.println("Zadejte věk:");
        // Validace věku je nastavená na rozmezí 1-120 let a použití pouze čísel, bez možností prázdného vstupu
        int vek = 0;
        boolean kontrolaVeku = false;
        do {
            String vekPojistence = scanner.nextLine();
            try {
                if (!vekPojistence.isEmpty()) {
                    vek = Integer.parseInt(vekPojistence);
                    if (vek > 0 && vek <= 120) {
                        kontrolaVeku = true;
                    } else {
                        System.out.println("Zadejte platný věk.");
                    }
                } else {
                    System.out.println("Zadejte platný věk.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Zadejte platné číslo.");
            }
        } while (!kontrolaVeku);

        Pojistenec pojistenec = new Pojistenec(jmeno, prijmeni, vek, telefon);
        evidencePojistenych.pridejPojistence(pojistenec);
        System.out.println("\nData byla uložena. Pokračujte libovolnou klávesou...\n");
    }

    /**
     * Zpracuje výpis všech pojištěných
     */
    public void vypisVsechnyPojisteny() {
        System.out.print("\n" + evidencePojistenych + "\n" +
                "Pokračujte libovolnou klávesou...\n\n");
    }

    /**
     * Zpacuje vyhledání pojištěného
     */
    public void vyhledejPojisteneho() {

        System.out.println("\nZadejte jméno pojištěného:");
        // Validace jména je nastavená bez možností prázdného vstupu
        String jmeno = scanner.nextLine();
        while (jmeno.isEmpty()) {
            System.out.println("Zadejte platné jméno");
            jmeno = scanner.nextLine();
        }

        System.out.println("Zadejte příjmení:");
        // Validace příjmení je nastavená bez možností prázdného vstupu
        String prijmeni = scanner.nextLine();
        while (prijmeni.isEmpty()) {
            System.out.println("Zadejte platné příjmení");
            prijmeni = scanner.nextLine();
        }

        System.out.println();
        evidencePojistenych.vyhledejPojistence(jmeno, prijmeni);
        System.out.println("\nPokračujte libovolnou klávesou...\n");
    }
}
