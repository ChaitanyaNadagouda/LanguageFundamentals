package Streams_n_Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        /*
        Functional Interface object creation:
        way1 : extend a class and make a instance of that object
        way2 : Using Anonymous class and directly creating and performing the action wch is inside the functional interface
        way3 : As functional interface have oly one abstract method so create and instance of it and pass the methods or task
                through lambdas .
         */

        List<Integer> numbers = Arrays.asList(1,2,7,4,3) ;
        List<Integer> numbersfromlambdas = numbers.stream().filter(n->n%2==0).toList();
        System.out.println("evenfilter : " + numbersfromlambdas);

        List<Integer> nummbersmapped = numbers.stream().map(n1->n1*2).collect(Collectors.toList()) ;
        System.out.println(nummbersmapped);

        List<Integer> sortedarray = numbers.stream().sorted().toList() ;
        System.out.println(sortedarray);

        numbers.stream().forEach(n-> System.out.println(n));

        int sum = numbers.stream().reduce(0,(n1,n2)->n1+n2) ;
        System.out.println(sum);

        System.out.println(numbers.stream().filter(n->n%2==0).findFirst());

    }
}
