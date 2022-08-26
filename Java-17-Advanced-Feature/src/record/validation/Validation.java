package record.validation;
public final  class Validation {

    private  Validation(){

    }

    public static boolean checkThat(boolean expr,String message){
        if(!expr) {
            throw new IllegalArgumentException(message); //Record throws  unchecked exception not checked exception
        }
        return true;
    }
}
