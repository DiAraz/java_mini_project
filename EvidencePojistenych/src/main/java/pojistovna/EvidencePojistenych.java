package pojistovna;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Třída reprezentuje evidenci pojištěných
 */
public class EvidencePojistenych {

    /**
     * Seznám pojištěných
     */
    private ArrayList<Pojistenec> pojistenci;

    /**
     * Vytvoří novou instanci seznamů pojištěných
     */
    public EvidencePojistenych() {
        pojistenci = new ArrayList<>();
    }

    /**
     * Přidá pojištěnce do seznamů
     *
     * @param novyPojistenec Nový pojištěnec
     */
    public void pridejPojistence(Pojistenec novyPojistenec) {
        pojistenci.add(novyPojistenec);
    }

    /**
     * Vyhledá pojištěnce ze seznamů podle jména a příjmení
     *
     * @param jmeno Jméno pojištěnce
     * @param prijmeni Příjmení pojištěnce
     */
    public void vyhledejPojistence(String jmeno, String prijmeni) {
        boolean nalezen = false;
        for (Pojistenec pojistenec : pojistenci) {
            if (pojistenec.getJmeno().equals(jmeno)
                    && pojistenec.getPrijmeni().equals(prijmeni)) {
                System.out.println(pojistenec);
                nalezen = true;
            }
        }
        if (!nalezen)
            System.out.println("Pojištěný není v databázi");
    }

    /**
     * Vrací textovou reprezentaci seznamů pojištěných
     *
     * @return Textová reprezentace seznamů pojištěných
     */
    @Override
    public String toString() {
        String seznamPojistencu = "";
        Collections.sort(pojistenci);
        for (int i = 0; i < pojistenci.size(); i++) {
            seznamPojistencu += pojistenci.get(i).toString() + "\n";
        }

        if (!pojistenci.isEmpty())
            return seznamPojistencu;
        return "V databázi nejsou žádní pojištěnci.Přidej pojištěnce.";
    }
}
