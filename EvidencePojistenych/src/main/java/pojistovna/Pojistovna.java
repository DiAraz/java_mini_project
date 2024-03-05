package pojistovna;

import java.util.Scanner;

public class Pojistovna {

    public static void main(String[] args) {


        // Vytvoření objektů
        UzivatelskeRozhrani pojistovna = new UzivatelskeRozhrani();
        Scanner scanner = new Scanner(System.in, "UTF8");

        // Start aplikace
        String volba = "";
        while (!volba.equals("4")) {
            pojistovna.vypisUvodniObrazovku();
            volba = scanner.nextLine();
            switch (volba) {
                case "1":
                    pojistovna.pridejPojistneho();
                    break;
                case "2":
                    pojistovna.vypisVsechnyPojisteny();
                    break;
                case "3":
                    pojistovna.vyhledejPojisteneho();
                    break;
                case "4":
                    System.out.println("\nDěkujeme za návštěvu našého portálu.\n");
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.\n");
                    break;
            }
        }
    }
}
