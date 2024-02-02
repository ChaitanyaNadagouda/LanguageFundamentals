package Generics;

public class Client {
    static void print(PairGenericType a){
        System.out.println(a.getFirst()) ;
        System.out.println(a.getSecond());
    }
    public static void main(String[] args) {
//        Pair<Integer,String> intstringpair = new Pair<>(1,"hey") ;
        Pair intstringpair = new Pair(1.0,"hey") ;
        PairGenericType p1 = new PairGenericType<>("brother","hello") ; //backward compatibility
        print(p1) ;
    }
}
