package pattern.factory;

public class MeatPizza extends Pizza {

    private String factoryName = null;

    public MeatPizza(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public String getName() {
        return factoryName + "'s Meat Pizza!";
    }
}
