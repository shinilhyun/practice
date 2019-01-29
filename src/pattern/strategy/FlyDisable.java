package pattern.strategy;

public class FlyDisable implements Fly {
    @Override
    public String getFly() {
        return "fly disabled!!";
    }
}
