package pojistovna;

/***
 * Třída reprezentuje pojištěnce
 */
public class Pojistenec implements Comparable<Pojistenec> {

    /**
     * Jméno pojištěnce
     */
    private String jmeno;

    /**
     * Příjmení pojištěnce
     */
    private String prijmeni;

    /**
     * Věk pojištěnce
     */
    private int vek;

    /**
     * Telefonní číslo pojištěnce
     */
    private String telefon;

    /**
     * Vytvoří novou instanci pojištěnce
     *
     * @param jmeno Jméno pojištěnce
     * @param prijmeni Příjmení pojištěnce
     * @param vek Věk pojištěnce
     * @param telefon Telefonní číslo pojištěnce
     */
    public Pojistenec(String jmeno, String prijmeni, int vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    /**
     * Vratí jméno pojištěnce
     *
     * @return Jméno pojištěnce
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * Vratí příjmení pojištěnce
     *
     * @return Příjmení pojištěnce
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * Vratí věk pojištěnce
     *
     * @return Věk pojištěnce
     */
    public int getVek() {
        return vek;
    }

    /**
     * Vratí telefonní číslo pojištěnce
     *
     * @return Telefonní číslo
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Porovná aktuálního pojištěnce s jiným pojištěncem
     * abecedně podle jména a příjmení
     *
     * @param jinyPojistenec Pojištěnec k porovnání
     * @return Porovnaný pojištěnec
     */
    @Override
    public int compareTo(Pojistenec jinyPojistenec) {
        if (this.getJmeno().equals(jinyPojistenec.getJmeno())) {
            return this.getPrijmeni().compareTo(jinyPojistenec.getPrijmeni());
        }
        return this.getJmeno().compareTo(jinyPojistenec.getJmeno());
    }

    /**
     * Vrací textovou reprezentaci pojištěnce
     *
     * @return Textová reprezentace pojištěnce
     */
    @Override
    public String toString() {
        return jmeno + "  " + prijmeni + "  " + vek + "     " + telefon;
    }
}
