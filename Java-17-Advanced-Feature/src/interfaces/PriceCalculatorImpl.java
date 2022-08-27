package interfaces;

import record.records.Order;

import java.math.BigDecimal;

public class PriceCalculatorImpl  implements  PriceCalculator{

    @Override
    public BigDecimal calculatePrice(Order order) {

        return null;
    }
    //You do not have to implement default method : default BigDecimal discount(Order order, BigDecimal discount) {}
    //You do not hav toe  implement static method :  static BigDecimal lowesPrice(Order order){}
    
}
