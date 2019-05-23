package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsMachine implements Publisher {

    private List<Observer> observers;
    private String title;
    private String news;

    public NewsMachine() {
        observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        if(observers.contains(observer)) observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(title, news);
        }
    }

    public void setNewsInfo(String title, String news) {
        this.title = title;
        this.news = news;
        notifyObserver();
    }

    public String getTitle() {
        return title;
    }

    public String getNews() {
        return news;
    }

}
