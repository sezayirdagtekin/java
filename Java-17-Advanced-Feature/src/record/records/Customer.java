package record.records;
import record.validation.Validation;

public record Customer(long id,String name,String email) {

   public  Customer {
       Validation.checkThat(name!=null,"Customer name can not be null");

    }

    //Third type of constructor
    public Customer(long id,String name){
        //call canonical constructor with this keyword
       this(id,name,null);
    }
}
