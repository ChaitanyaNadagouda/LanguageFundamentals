package executorsAndCallables;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool() ;
//        ExecutorService executor = Executors.newFixedThreadPool(5) ;
        for(int i=1;i<=100;i++){
            if(i == 5 || i == 11 || i == 20 || i == 88 || i==100){
                System.out.println("DEBUG");
            }
            printonetoHundred poh = new printonetoHundred(i) ;
            executor.execute(poh);
        }
    }
}
