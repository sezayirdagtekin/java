package annotation;

import java.lang.annotation.*;

//@Target( {ElementType.TYPE,ElementType.METHOD})
@Target( {ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
//If we do not use we wil get error  in LoginCommand class
//Duplicate annotation. The declaration of 'annotation.Command' does not have a valid java.lang.annotation.Repeatable annotation
@Repeatable(Commands.class) //
@Documented
public @interface  Command{

    String  value();
    String description() default ""; //null is not allowed here
    int oder() default 1;

}