package Concurrency;

public class printHelloWorld implements Runnable{

    @Override
    public void run() {
        System.out.println("this is printed by " + Thread.currentThread().getName());
    }
}
