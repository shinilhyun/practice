package pattern.decorate.coffee;

public class CoffeeRun {
    public static void main(String[] args) {
        Beverage a= new Whip(new Sugar(new Americano()));

        System.out.println(a.getCost());
        System.out.println(a.getName());
    }
}
