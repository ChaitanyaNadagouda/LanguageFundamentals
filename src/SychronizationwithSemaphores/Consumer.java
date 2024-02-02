package SychronizationwithSemaphores;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    String name ;
    Queue<Shirt> store ;
    Semaphore consumerSema ;
    Semaphore Producersema ;

//    Queue<Shirt> store = new LinkedList() ;
    Consumer(String name,Queue<Shirt> store,Semaphore consumerSema,Semaphore Producersema){
        this.name = name ;
        this.store=store ;
        this.consumerSema = consumerSema ;
        this.Producersema = Producersema ;
    }

    @Override
    public void run() {
        while(true){
//            if(store.size()>0) {
                try {
                    consumerSema.acquire();
                    store.remove() ;
                    System.out.println("Store size is : " + this.store.size() + " removed by consumer " + this.name) ;
                    Producersema.release();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
//            }
        }
    }
}
