package ExceptionHandling;

public class divideBySmthng{
    public void divide(int[] arr,int A) throws DividebyZero {
//        try {
            for (int i=0;i<arr.length;i++) {
                System.out.println(dividebythis(arr[i], A));
            }
//        }catch(ArithmeticException | DividebyZero e){
//            System.out.println("dividing by zero");
//        }
    }
    public int dividebythis(int i , int a) throws DividebyZero {
        if(i<=0){
            throw new DividebyZero() ;
        }
        return a/i ;
    }
}
