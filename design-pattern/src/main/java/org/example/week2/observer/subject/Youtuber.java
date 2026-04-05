package org.example.week2.observer.subject;

import org.example.week2.observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Youtuber {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer){
        subscribers.add(observer);
    }

    public void unsubscribe(Observer observer){
        subscribers.remove(observer);
    }

    public void uploadVideo(String title){
        for(Observer o : subscribers){
            o.update(title);
        }
    }
}
