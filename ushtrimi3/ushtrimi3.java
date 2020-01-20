public class ushtrimi3 {
    public static void main(String[] args) {
        Makina m = new Makina(50); // 50 milje per galon
        m.addGaz(20); // mbushet me 20 galon
        m.drive(100); // 100 milje lecizje
        System.out.println(m.getGazInTank());
    }
}