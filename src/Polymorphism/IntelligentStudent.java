package Polymorphism;

public class IntelligentStudent extends Student{
    @Override
    public void printinfo(int id) {
        System.out.println("subclass" + id);
    }
}
