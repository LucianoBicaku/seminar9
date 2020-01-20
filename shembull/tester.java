public class tester {
    private int itemCount;
    private double totalPrice;

    public tester() {
        this.itemCount = 0;
        this.totalPrice = 0;
    }

    public void addItem(double price) {
        itemCount++;
        totalPrice += price;
    }

    public double getTotal() {
        return totalPrice;
    }

    public int getcount() {
        return itemCount;
    }

    public void clear() {
        this.itemCount = 0;
        this.totalPrice = 0;
    }

}