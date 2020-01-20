public class Product {
    String name;
    Double price;

    Product(String n, double p) {
        this.name = n;
        this.price = p;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void reducePrice(double reduce) {
        this.price -= reduce;
    }
}