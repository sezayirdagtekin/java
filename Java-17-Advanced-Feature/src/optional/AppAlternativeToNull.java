package optional;


import record.records.Product;

import java.util.List;
import java.util.Optional;

import static optional.Data.DEFAULT_PRODUCT;


public class AppAlternativeToNull {
    private static List<Product> PRODUCTS = Data.getProducts();


    public static void main(String[] args) {

        System.out.println(findProductById(2));
        System.out.println(findProductById(99));


        System.out.println(findOptionalProductById(2));
        System.out.println(findOptionalProductById(99));

        Optional<Product> optional = Optional.ofNullable((findProductById(99)));


        System.out.println(optional.orElse(DEFAULT_PRODUCT));
        System.out.println(optional.orElseGet(() -> DEFAULT_PRODUCT));
        System.out.println(optional.orElseThrow(() -> new RuntimeException("Product not found!")));


    }


    public static Product findProductById(long id) {

        for (Product product : PRODUCTS) {
            if (product.id() == id) {
                return product;
            }
        }
        return null;
    }

    public static Optional<Product> findOptionalProductById(long id) {

        for (Product product : PRODUCTS) {
            if (product.id() == id) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

}


