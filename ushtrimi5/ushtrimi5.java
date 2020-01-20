public class ushtrimi5 {
    public static void main(String[] args) {
        Population p = new Population(100);
        System.out.println(p.getPop());
        p.shtoPop();
        System.out.println(p.getPop());
        p.reducePop();
        System.out.println(p.getPop());
    }
}