package record.records;

import java.time.LocalDateTime;
import java.util.List;

import record.validation.Validation;

public record Order(long id,Customer customer, LocalDateTime dateTime, List<OrderLine> orderLine) {

    //Experimental codes

/*
    //Prefer Compact constructor. More readable
    //Compact constructor
    public Order {

        //Record throws  unchecked exception not checked exception
        checkThat(customer != null, "Customer can not be null");
        checkThat(dateTime != null, "Date time can not be null");
        checkThat(orderLine != null && !orderLine.isEmpty(), "Customer can not be null");
        orderLine = List.copyOf(orderLine); //Unmodifiable list
    }
*/

    //Canonical constructor
    public Order(long id,Customer customer, LocalDateTime dateTime, List<OrderLine> orderLine){

        //Record throws  unchecked exception not checked exception
        Validation.checkThat(customer!=null,"Customer can not be null");
        Validation.checkThat(dateTime!=null,"Date time can not be null");
        Validation.checkThat(orderLine!=null && !orderLine.isEmpty(),"Customer can not be null");
        this.id=id;
        this.customer=customer;
        this.dateTime=dateTime;
        this.orderLine= List.copyOf(orderLine); //Unmodifiable list
    }


    //Using static factory method.
    //Call canonical constructor.  LocalDateTime.now() is removed from parameters
    public static Order  CreateOderAtCurrenDateTime(long id,Customer customer,List<OrderLine> orderLine){
      return new Order(id,customer, LocalDateTime.now(),orderLine);
    }
}
