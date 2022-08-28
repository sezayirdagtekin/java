package generics.record;

public class App {

    public static void main(String[] args) {

        Pair<String,Integer> pair= Pair.of("USA",1);
        var uk =Pair.of("UK",44);

        //Full syntax
        var tr= Pair.<String,Integer>of("TR",90);
        var ge =Pair.<String,Integer>of("GE",49);

        System.out.println(ge);
        var updatedGe =  ge.withFirst("Germany");
        System.out.println("updatedGe:"+updatedGe);

        System.out.println(tr);
        var mappedTR = tr.map((left, right) -> Pair.of(left, right));
        System.out.println("mappedTR:"+mappedTR);
    }
}
