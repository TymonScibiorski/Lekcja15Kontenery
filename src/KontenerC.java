public class KontenerC extends Kontener{

    public KontenerC(int max_ladunek_kg, int masa_ladunku_kg, int masa_kontenera_kg, int wysokosc_cm, int glebokosc_cm) throws OverfillException {
        super(max_ladunek_kg, masa_ladunku_kg, masa_kontenera_kg, wysokosc_cm, glebokosc_cm);
    }

    public String getId(){
        return "KON-C-" + idInt;
    }
}
