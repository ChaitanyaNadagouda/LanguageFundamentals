package executorsAndCallables.Mergesorter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Mergsort implements Callable<List<Integer>> {

    List<Integer> arr ;
    ExecutorService service ;
    Mergsort(List<Integer>arr, ExecutorService service){
        this.arr=arr ;
        this.service = service ;
    }
    @Override
    public List<Integer> call() throws Exception {
        if(arr.size()<=1){
            return arr ;
        }
        int mid = arr.size()/2 ;
        List<Integer> leftarr = new ArrayList<>() ;
        List<Integer> rightarr = new ArrayList<>() ;
        for(int i=0;i<mid ; i++){
            leftarr.add(arr.get(i)) ;
        }
        for(int i=mid;i<arr.size();i++){
            rightarr.add(arr.get(i)) ;
        }
        Mergsort leftms = new Mergsort(leftarr,service) ;
        Mergsort rightms = new Mergsort(rightarr,service) ;

        Future<List<Integer>> leftsortedarr = service.submit(leftms);
        Future<List<Integer>> rightsortedarr = service.submit(rightms) ;
        List<Integer> leftsortedarray = leftsortedarr.get() ;
        List<Integer> rightsortedarray = rightsortedarr.get() ;
        int i=0;
        int j=0 ;
        List<Integer> finalsortedarr = new ArrayList<>() ;
        while(i<leftsortedarray.size() && j<rightsortedarray.size()){
            if(leftsortedarray.get(i)<rightsortedarray.get(j)){
                finalsortedarr.add(leftsortedarray.get(i)) ;
                i++ ;
            }else{
                finalsortedarr.add(rightsortedarray.get(j)) ;
                j++ ;
            }
        }

        while(i < leftsortedarray.size()){
            finalsortedarr.add(leftsortedarray.get(i));
            i++;
        }

        while(j < rightsortedarray.size()){
            finalsortedarr.add(rightsortedarray.get(j));
            j++;
        }
        return finalsortedarr ;
    }
}
