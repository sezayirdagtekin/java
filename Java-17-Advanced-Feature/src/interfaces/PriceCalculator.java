package interfaces;

import record.records.Order;

import java.math.BigDecimal;

//Interface – Define a common contract for implementing classes
//Abstract class – Provide a way to share implementation code
@FunctionalInterface
public interface PriceCalculator {
    // Added in version 1
    BigDecimal calculatePrice(Order order);

    // Added in version 2
    default BigDecimal discount(Order order, BigDecimal discount) {
        printOrder(order);
        return BigDecimal.ZERO;
    }

    static BigDecimal lowesPrice(Order order) {
        printMessage("private static method can be called from static method in interface");
        return BigDecimal.ONE;
    }

    // Private methods Share code between  default methods.(can be called from default method in interface)
    private void printOrder(Order order) {
        System.out.println("PriceCalculator print order" + order.toString());
    }

    private static void printMessage(String message) {
        System.out.println("PriceCalculator print message" + message);
    }

}
