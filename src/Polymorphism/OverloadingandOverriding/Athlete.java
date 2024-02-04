package Polymorphism.OverloadingandOverriding;

public class Athlete extends HumanBeing{
    public int walk(int distance, int time) {
        int speed = distance / time;
        speed = speed * 2;
        return speed;
    }
}
