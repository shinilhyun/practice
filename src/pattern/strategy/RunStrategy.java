package pattern.strategy;

public class RunStrategy {
    public static void main(String[] args) {
        Duck rd = new RubberDuck();
        rd.setCry(new CryMute());
        rd.setFly(new FlyDisable());
        rd.display();

        Duck real = new RealDuck();
        real.setCry(new CryWang());
        real.setFly(new FlyEnable());
        real.display();
    }
}
