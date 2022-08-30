package optional;

import record.records.Product;

import java.util.List;

public class Data {
    protected final static Product DEFAULT_PRODUCT = new Product(0, "default", "default");
    public static List<Product> getProducts() {
        Product e1 = new Product(1, "Apple", "Red Apple");
        Product e2 = new Product(2, "Orange", "Yellow Orange");
        Product e3 = new Product(3, "Bread", "Turkish bread");
        return List.of(e1, e2, e3);
    }
}
