import record.records.Customer;
import record.records.Order;
import record.records.OrderLine;
import record.records.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {

        var product1 = new Product(1000L, "Apple", "Red Apple");
        var product2 = new Product(1001L, "Orange", "Yellow Orange");

        var customer = new Customer(1, "Sezayir", "sezayirx99@gmail.com");
        var orderLine1 = new OrderLine(product1, 2, new BigDecimal(10));
        var orderLine2 = new OrderLine(product2, 4, new BigDecimal(8));

        List<OrderLine> orderLines = new ArrayList<>();
        orderLines.add(orderLine1);
        orderLines.add(orderLine2);
        var order = new Order(1,customer, LocalDateTime.now(),orderLines);

        System.out.println(order);
       //.UnsupportedOperationException . Because Orderlines is unmodifiable
      //  order.orderLine().add(orderLine1);
    }

}
