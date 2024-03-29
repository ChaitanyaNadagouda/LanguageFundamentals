package SychronizationwithSemaphores;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Shirt> store = new LinkedList<>() ;
        int maxSize = 5 ;
        Semaphore Producersema = new Semaphore(5) ;
        Semaphore consumerSema = new Semaphore(0) ;
        Producer p1 = new Producer("p1",5,store,Producersema,consumerSema) ;
        Producer p2 = new Producer("p2",5,store,Producersema,consumerSema) ;
        Producer p3 = new Producer("p3",5,store,Producersema,consumerSema) ;
        Producer p4 = new Producer("p4",5,store,Producersema,consumerSema) ;
        Producer p5 = new Producer("p5",5,store,Producersema,consumerSema) ;

        Consumer c1 = new Consumer("c1",store,consumerSema,Producersema) ;
        Consumer c2 = new Consumer("c1",store,consumerSema,Producersema) ;
        Consumer c3 = new Consumer("c1",store,consumerSema,Producersema) ;
        Consumer c4 = new Consumer("c1",store,consumerSema,Producersema) ;
        Consumer c5 = new Consumer("c1",store,consumerSema,Producersema) ;

        Thread tp1 = new Thread(p1);
        tp1.start();
        Thread tp2 = new Thread(p2);
        tp2.start();
        Thread tp3 = new Thread(p3);
        tp3.start();
        Thread tp4 = new Thread(p4);
        tp4.start();
        Thread tp5 = new Thread(p5);
        tp5.start();

        Thread tc1 = new Thread(c1);
        tc1.start();
        Thread tc2 = new Thread(c2);
        tc2.start();
        Thread tc3 = new Thread(c3);
        tc3.start();
        Thread tc4 = new Thread(c4);
        tc4.start();
        Thread tc5 = new Thread(c5);
        tc5.start();
    }
}
