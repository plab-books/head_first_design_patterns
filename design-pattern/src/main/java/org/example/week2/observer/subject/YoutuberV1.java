package org.example.week2.observer.subject;

import org.example.week2.observer.interfaces.ObserverV1;

import java.util.ArrayList;
import java.util.List;

public class YoutuberV1 {
    private List<ObserverV1> subscribers = new ArrayList<>();

    public void subscribe(ObserverV1 observerV1){
        subscribers.add(observerV1);
    }

    public void unsubscribe(ObserverV1 observerV1){
        subscribers.remove(observerV1);
    }

    public void uploadVideo(String title){
        for(ObserverV1 o : subscribers){
            o.update(title);
        }
    }
}
