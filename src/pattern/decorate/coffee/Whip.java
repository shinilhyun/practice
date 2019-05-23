package pattern.decorate.coffee;

public class Whip extends Americano {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;

    }

    @Override
    public String getName() {
        return beverage.getName() + ", plus Whip";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 500;
    }
}
