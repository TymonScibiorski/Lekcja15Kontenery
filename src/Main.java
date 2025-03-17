import java.util.ArrayList;

public class Main{
    ArrayList<Kontener> kontenery = new ArrayList<>();

    public static void main(String[] args) throws OverfillException {
        Kontener_L dupa = new Kontener_L(1, 1, 1, 1, 1);
        System.out.println(dupa.getId());
    }
}