package lamda;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AppEffectivelyFinalError {
//In simple terms, objects or primitive values are effectively final if we do not change their values after initialization.
// In the case of objects, if we do not change the reference of an object, then it is effectively final -
// even if a change occurs in the state of the referenced object

    public static void main(String[] args) {


        var names= List.of("Joe Smith","Susan Miller","Will Johnson");
        int cnt=0;

        for (String name: names ){
           System.out.println( ++cnt+"."+ name);

        }

       // Compiler E ror:Variable used in lambda expression should be final or effectively final
       // names.forEach(s->System.out.println( System.out.println( ++cnt+"."+ s));

        //Alternative
         AtomicInteger count= new AtomicInteger(0);
         names.forEach(s->System.out.println(count.incrementAndGet()+"."+ s));
    }
}
