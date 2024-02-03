package HashCodeandEquals;

import java.util.HashSet;
import java.util.Set;

public class Client {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "ram");
        Employee e2 = new Employee(1, "ram");

        System.out.println(e1.equals(e2));
//
//        System.out.println(e1 + "  " + e2);
        Set<Employee> set = new HashSet<>() ;
        set.add(e1) ;
        set.add(e2) ;
        System.out.println(set);
        /*
        Hashcode and equals contract states that :
        1) if two object's hashcode are same then those two objects may or may not be equal .
        2) if both objects are equals then their hashcode for sure is same .
         */
    }
}
