package pattern.factory;

public class Papazons extends PizzaFactory {

    private String factoryName = "papazons";

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



