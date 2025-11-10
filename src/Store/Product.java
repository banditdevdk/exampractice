package Store;

public class Product implements Comparable<Product> {
    private String type;
    private String size;
    private double price;


    public Product(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    @Override
    public String toString() {
        return type + " " + size + " " + price + " ";
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }
}
