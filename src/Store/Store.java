package Store;

import java.util.ArrayList;
import java.util.Collections;

public class Store {
    private ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        Store store = new Store();

        Product p1 = new Product("T-shirt", "M", 99.99);
        Product p2 = new Product("Hoodie", "L", 199.99);
        Product p3 = new Product("T-shirt", "S", 49.99);

        store.products.add(p1);
        store.products.add(p2);
        store.products.add(p3);

        System.out.println(p1);

        System.out.println(store.products);

        System.out.println(store.getTotalPrice());

        System.out.println(store.getTypeShirtAmount("Hoodie"));

        Collections.sort(store.products);
        System.out.println(store.products);

    }

    public double getTotalPrice() {
        double sum = 0;
        for (Product p: products) {
            sum += p.getPrice();
        }
        return sum;
    }

    public int getTypeShirtAmount(String input) {
        ArrayList<Product> result = new ArrayList<>();

        for (Product p: products) {
            if (p.getType().equalsIgnoreCase(input)) {
                result.add(p);
            }
        }
        return result.size();
    }

}
