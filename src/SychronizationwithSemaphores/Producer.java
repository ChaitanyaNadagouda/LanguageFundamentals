package SychronizationwithSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    String name ;
    Queue<Shirt> store ;
    Semaphore Producersema ;
    Semaphore consumerSema ;
    int maxSize ;
    Producer(String name , int maxSize,Queue<Shirt> store, Semaphore Producersema,Semaphore consumerSema){
        this.name = name ;
        this.maxSize = maxSize ;
        this.store=store;
        this.Producersema = Producersema ;
        this.consumerSema = consumerSema ;
    }

    @Override
    public void run() {
        while(true){
//            if(store.size()<maxSize){
                try {
                    Producersema.acquire();
                    store.add(new Shirt()) ;
                    System.out.println("Store size is : " + this.store.size() + " added by consumer " + this.name);
                    consumerSema.release();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
//            }
        }
    }
}
