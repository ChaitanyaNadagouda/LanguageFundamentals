package Synchronization;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Count count ;
    Lock lock ;
    Adder(Count count,Lock lock){
        this.count=count ;
        this.lock=lock ;
    }

    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
//            lock.lock();
            synchronized (count){
                count.value+=i ;
            }
//            lock.unlock();
        }
    }
}
