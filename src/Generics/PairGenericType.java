package Generics;

public class PairGenericType<Type1,Type2> {
    Type1 first ;
    Type2 second ;
    PairGenericType(Type1 first , Type2 second){
        this.first = first ;
        this.second = second ;
    }
    Type1 getFirst(){
        return first ;
    }
    Type2 getSecond(){
        return second ;
    }
}
