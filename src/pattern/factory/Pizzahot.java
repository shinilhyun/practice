package pattern.factory;

public class Pizzahot extends PizzaFactory {
    private String factoryName = "PizzaHot";

    @Override
    Pizza getPizza(String name) {
        switch (name) {
            case "c":
                return new CheasePizza(factoryName);
            case "m":
                return new MeatPizza(factoryName);
        }
        return null;
    }
}

