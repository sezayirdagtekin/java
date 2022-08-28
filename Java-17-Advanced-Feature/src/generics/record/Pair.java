package generics.record;

import java.util.function.BiFunction;

public record Pair<T, U>(T first, U second) {

    //Static method can not access enclosing type parameter <T, U>
    // That why we used   <K,V>
    public static <K,V> Pair<K,V>  of(K _first, V _second) {
        //return new Pair<>(first, second); //can not access enclosing instance member
        return new Pair<>(_first, _second);// this is not instance. It is instantiation generic
    }


    public <T,U> Pair withFirst(T newFirst){
        return Pair.of(newFirst, second);
    }

    public <T,U> Pair withSecond(U newSecond){
        return Pair.of(first,newSecond);
    }

    public  <K,V> Pair map(BiFunction< T,U,Pair<K,V>> biFunction){
        return biFunction.apply(first,second);
    }
}
