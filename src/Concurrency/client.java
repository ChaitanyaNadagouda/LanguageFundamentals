package Concurrency;

public class client {
    public static void main(String[] args) {
        printHelloWorld phw = new printHelloWorld() ;
        Thread t = new Thread(phw) ;
        t.start() ;
        System.out.println("this is printed by thread: " + Thread.currentThread().getName());
    }
}
