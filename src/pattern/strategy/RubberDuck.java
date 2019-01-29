package pattern.strategy;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("RubberDuck!!");
        System.out.println(fly.getFly());
        System.out.println(cry.getCry());
    }
}
