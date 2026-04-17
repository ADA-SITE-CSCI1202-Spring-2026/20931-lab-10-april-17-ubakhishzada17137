import java.util.List;
import java.util.function.*;

public class Product {
    String name;
    double price;
    boolean inStock;

    public Product(String name, double price, boolean inStock){
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public String getName()    { return name; }
    public double getPrice()   { return price; }
    public boolean isInStock() { return inStock; }

        @Override
    public String toString() {
        return name + " | $" + price + " | In Stock: " + inStock;
    }

    public static void main(String[] args) {
        List<Product> products =  List.of(new Product("Computer", 500, true), 
        new Product("pen", 2, true), 
        new Product("Notebook", 20, true));

        Predicate<Product> isAffordable = p -> p.getPrice() < 50 && p.isInStock();

        products.removeIf(Predicate.not(isAffordable));

    }
}
