import java.util.*;

public class CashRegister {
    ArrayList<Double> cmime;

    CashRegister(double c1, double c2, double c3) {
        cmime.add(c1);
        cmime.add(c2);
        cmime.add(c3);
    }

    public ArrayList<Double> getCmimet() {
        return (cmime);
    }
}