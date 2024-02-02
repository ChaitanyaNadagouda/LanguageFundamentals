package executorsAndCallables.Mergesorter;

import java.net.ProxySelector;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> arr = List.of(3,7,8,9,1,4,2,1) ;
        ExecutorService service = Executors.newCachedThreadPool() ;
        Mergsort ms = new Mergsort(arr,service) ;
        Future<List<Integer>> sortedarr = service.submit(ms) ;
//        List<Integer> sortedarr = ms.call() ;
        List<Integer> finalsortedarray = sortedarr.get() ;
        System.out.println(finalsortedarray);
    }
}
