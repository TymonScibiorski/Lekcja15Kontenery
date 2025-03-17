import java.util.ArrayList;

public class Kontener {
    final int max_ladunek_kg;
    int masa_ladunku_kg;
    final int masa_kontenera_kg;
    final int wysokosc_cm;
    final int glebokosc_cm;
    final int idInt;



    private Kontener(int max_ladunek_kg, int masa_ladunku_kg, int masa_kontenera_kg, int wysokosc_cm, int glebokosc_cm, ArrayList<Kontener> kontenery) throws OverfillException {
        this.max_ladunek_kg = max_ladunek_kg;
        this.masa_ladunku_kg = masa_ladunku_kg;
        zaladowanieMasa(masa_ladunku_kg);
        this.masa_kontenera_kg = masa_kontenera_kg;
        this.wysokosc_cm = wysokosc_cm;
        this.glebokosc_cm = glebokosc_cm;
        this.idInt = createIntId();
    }

    private int createIntId(ArrayList<Kontener> kontenery) {
        //TODO: make it return actual unique ids.
        /*
        If list of konteners empty: give id 0
        If not empty: add one to
         */
        for (int i = 0; i < kontenery.size(); i++) {
            if (kontenery.get(i))
        }

        return 1;
    }

    public void OproznienieLadunku(){
        masa_ladunku_kg = 0;
    }

    public void zaladowanieMasa(int ladunek_kg) throws OverfillException{
        if(ladunek_kg > max_ladunek_kg){
            throw new OverfillException();
        }
        masa_ladunku_kg = ladunek_kg;
    }


}
