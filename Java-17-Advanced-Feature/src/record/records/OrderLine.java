package record.records;

import record.validation.Validation;

import java.math.BigDecimal;

public record OrderLine(Product product, int quantity, BigDecimal price) {


    public OrderLine{
        Validation.checkThat(product!=null,"Product can not be null!");
        Validation.checkThat(price!=null,"Product can not be null!");
    }

    //Use only when you really need use Wither method. Use builder pattern better
    //Wither method record for change attribute
    public OrderLine withQuantity(int quantity) {
        return new OrderLine(this.product, quantity, this.price);
    }

    //Wither method record for change attribute
    public OrderLine withPrice(BigDecimal price) {
        return new OrderLine(this.product, this.quantity, price);
    }


}



