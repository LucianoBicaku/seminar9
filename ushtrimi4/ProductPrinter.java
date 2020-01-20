public class ProductPrinter {
    public static void main(String[] args) {
        Product p1 = new Product("tost", 10.5);
        Product p2 = new Product("laptop", 230.99);

        System.out.println(p1.getName() + ":" + p1.getPrice());
        System.out.println(p2.getName() + ":" + p2.getPrice());

        p1.reducePrice(5.0);
        p2.reducePrice(5.0);

        System.out.println(p1.getName() + ":" + p1.getPrice());
        System.out.println(p2.getName() + ":" + p2.getPrice());
    }
}