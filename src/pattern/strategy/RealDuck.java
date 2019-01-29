package pattern.strategy;

public class RealDuck extends Duck {
    @Override
    public void display() {
        System.out.println("RealDuck!!");
        System.out.println(fly.getFly());
        System.out.println(cry.getCry());
    }
}
