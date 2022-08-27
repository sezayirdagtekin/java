package interfaces;

import record.records.Order;

import java.math.BigDecimal;

public class PriceCalculatorImpl  implements  PriceCalculator{

    @Override
    public BigDecimal calculatePrice(Order order) {

        return null;
    }
    //You do not have to implement default method (Order order,BigDecimal discount) in here
    //You do not hav toe  implement static method lowesPrice(Order order) in here


}
