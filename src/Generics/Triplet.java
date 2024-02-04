package Generics;

public class Triplet<Type> {
    private Type low ;
    private Type mid ;
    private Type high ;

    public Triplet(Type low, Type mid, Type high) {
        this.low = low;
        this.mid = mid;
        this.high = high;
    }

    public Type getLow() {
        return low;
    }

    public Type getMid() {
        return mid;
    }

    public Type getHigh() {
        return high;
    }
}
