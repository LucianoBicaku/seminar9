public class ushtrimi1 {
    public static void main(String[] args) {
        Adresa obj1 = new Adresa(15, "endri keko", 12, "tirane", "shqiperi", 1004);
        Adresa obj2 = new Adresa(15, "endri keko", 12, "tirane", "shqiperi", 1005);

        System.out.println(obj1.comesBefore(obj2.ktheKod()));
        System.out.println(obj2.comesBefore(obj1.ktheKod()));
    }
}