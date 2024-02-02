package Polymorphism;

public class Student {
    String name ;
    int id ;
    int psp ;

    public void printinfo(String name,int id){
        System.out.println(name + " " + id);
    }
    public void printinfo(int id,String name){
        System.out.println(id + " " + name);
    }
    public void printinfo(int id){
        System.out.println("oly " + id);
    }
}
