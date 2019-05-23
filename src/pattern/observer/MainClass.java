package pattern.observer;

public class MainClass {
    public static void main(String[] args) {
        NewsMachine newsMachine = new NewsMachine();
        AnnualSubscriber annualSubscriber = new AnnualSubscriber(newsMachine);
        EventSubscriber eventSubscriber = new EventSubscriber(newsMachine);

        newsMachine.setNewsInfo("today hanpa", "sldfjsdlfj15");
        newsMachine.setNewsInfo("alsdfjlasdf", "sldfjksdlf");

        newsMachine.delete(annualSubscriber);

        newsMachine.notifyObserver();
    }
}
