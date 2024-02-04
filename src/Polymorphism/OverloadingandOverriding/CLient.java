package Polymorphism.OverloadingandOverriding;

import DiamonProblem.A;

public class CLient {
    public static void main(String[] args) {
        HumanBeing hb = new Athlete() ;
        System.out.println(hb.walk(50,10)) ;

    }
}
