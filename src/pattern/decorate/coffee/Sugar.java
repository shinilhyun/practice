package pattern.decorate.coffee;

public class Sugar extends Americano {

    Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getName() {
        return beverage.getName() + "," + "plus sugar";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 300;
    }
}
