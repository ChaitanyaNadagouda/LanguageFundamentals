package ExceptionHandling;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws DividebyZero,InvalidNumberException{
        Scanner sc = new Scanner(System.in) ;
        int A = sc.nextInt() ;
        if(A<99){
            throw new InvalidNumberException("Please enter valid number") ;
//            throw new IllegalArgumentException() ;
        }

        divideBySmthng d1 = new divideBySmthng() ;
        int[] arr = {10,5,0,3,25} ;
        try{
            d1.divide(arr,A) ;
        }catch(DividebyZero dividebyZero){
            System.out.println("Dividing by by zero");
        }
        finally {
            System.out.println("No matter what this block executes");
        };
    }
}
