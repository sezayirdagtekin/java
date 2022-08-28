package generics.multiplebound;

public record Person (long id,String name,String job) implements  HasName,HasId{

}
