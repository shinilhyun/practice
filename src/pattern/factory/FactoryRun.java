package pattern.factory;

public class FactoryRun {
    public static void main(String[] args) {
        PizzaFactory papa = new Papazons();
        Pizza p1 = papa.getPizza("c");
        Pizza p2 = papa.getPizza("m");

        PizzaFactory hot = new Pizzahot();
        Pizza h1 = hot.getPizza("c");
        Pizza h2 = hot.getPizza("m");

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(h1.getName());
        System.out.println(h2.getName());
    }

}
