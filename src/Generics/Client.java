package Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    static <Type1,Type2> void print(PairGenericType <Type1,Type2> a){
        System.out.println(a.getFirst()) ;
        System.out.println(a.getSecond());
    }
    static <Object> void print(Pair p){
        System.out.println(p.getFirst()) ;
        System.out.println(p.getSecond());
    }
    static <Type> void print(List<Triplet<Type>> triplet){
        for(Triplet<Type> t:triplet){
            System.out.println(t.getLow()+" , "+t.getMid()+" , "+t.getHigh());
        }
    }
    static double printavg(Triplet<? extends Number> triplet){
        return (triplet.getLow().doubleValue()+triplet.getMid().doubleValue()+triplet.getHigh().doubleValue())/3 ;
    }
    public static void main(String[] args) {
//      1)
        Pair intstringpair = new Pair(1,"hey") ;
        Pair intstringpair1 = new Pair(1.0,"hey") ;//backward Compatibility
        print(intstringpair);
//      2)
        PairGenericType<String,String> p1 = new PairGenericType<>("brother","hello") ;
        PairGenericType p2 = new PairGenericType<>("brother","hello") ; //backward compatibility

//       3)
        /*
        if you dont specify the data types then java takes the parameters as object type this because in order to support backward
        compartibility the data type is of raw type .
         */
        String s = (String) p2.getFirst(); //it take object as data type , raw
        print(p1) ;
        print(p2) ;
//
//      4)
        Triplet<Integer> t1 = new Triplet<>(12,34,72) ;
        Triplet<Integer> t2 = new Triplet<>(10,34,72) ;
        List<Triplet<Integer>> listtriplet = new ArrayList<>() ;
        listtriplet.add(t1) ;
        listtriplet.add(t2) ;
        print(listtriplet);
//
//      5)
        Triplet<Integer> newarr1 = new Triplet<>(12,34,72) ;
        Triplet<Double> newarr2 = new Triplet<>(10.0,34.0,72.0) ;
        System.out.println(printavg(newarr1)) ;
        System.out.println(printavg(newarr2)) ;

//      6)
        Triplet<String> T1 = new Triplet<>("haanji","nice","ok") ;
        Triplet<String> T2 = new Triplet<>("ok","hmm","happens") ;
        List<Triplet<String>> listtriplet1 = new ArrayList<>() ;
        listtriplet1.add(T1) ;
        listtriplet1.add(T2) ;
        print(listtriplet1);
    }
}
