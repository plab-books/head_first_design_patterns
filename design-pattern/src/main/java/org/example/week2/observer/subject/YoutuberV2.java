package org.example.week2.observer.subject;

import org.example.week2.observer.interfaces.ObserverV1;
import org.example.week2.observer.interfaces.ObserverV2;
import org.example.week2.observer.interfaces.VideoEvent;

import java.util.ArrayList;
import java.util.List;

public class YoutuberV2 {
    private List<ObserverV2> subscribers = new ArrayList<>();

    public void subscribe(ObserverV2 observerV2){
        subscribers.add(observerV2);
    }

    public void unsubscribe(ObserverV2 observerV2){
        subscribers.remove(observerV2);
    }

    public void uploadVideo(VideoEvent videoEvent){
        for(ObserverV2 o : subscribers){
            o.update(videoEvent);
        }
    }
}
