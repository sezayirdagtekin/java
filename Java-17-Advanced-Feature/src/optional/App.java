package optional;


import com.sun.tools.javac.Main;
import record.records.Product;

import java.util.List;
import java.util.Optional;


class AppOptionalWithStream {
    private static List<Product> PRODUCTS = Data.getProducts();
    private final static Product defaultProduct = new Product(0, "default", "default");

    public static void main(String[] args) {


        findProductByIdWithStream(2).ifPresent(product-> System.out.println("Product is found:"+product));
        findProductByIdWithStream(3).ifPresentOrElse(product-> System.out.println("Product is found:"+product), ()-> System.out.println("Product not found"));
        findProductByIdWithStream(99).ifPresentOrElse(product-> System.out.println("Product is found:"+product), ()-> System.out.println("Product not found"));

        String name=findProductByIdWithStream(3).map(p-> p.name()).orElse("Product is not found!**");
        System.out.println(name);
    }



    public static Optional<Product> findProductByIdWithStream(long id) {

        return PRODUCTS.stream().filter(p -> p.id() == id).findFirst();
    }

}


