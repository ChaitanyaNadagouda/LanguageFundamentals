package Polymorphism;

public class DumbStudent extends Student{
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
