package pattern.factory;

public class CheasePizza extends Pizza {

    private String factoryName = null;

    public CheasePizza(String factoryName) {
        this.factoryName = factoryName;
    }
    @Override
    public String getName() {
        return factoryName + "'s Chease Pizza!";
    }
}
