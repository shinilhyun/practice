package pattern.decorate.coffee;

public class Americano implements Beverage {

    @Override
    public String getName() {
        return "americano";
    }

    @Override
    public int getCost() {
        return 3500;
    }
}
