package pattern.strategy;

public abstract class Duck {
    Cry cry;
    Fly fly;

    public void setCry(Cry cry) {
        this.cry = cry;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public abstract void display();
}
