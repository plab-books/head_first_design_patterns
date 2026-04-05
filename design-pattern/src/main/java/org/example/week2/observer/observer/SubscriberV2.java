package org.example.week2.observer.observer;

import org.example.week2.observer.interfaces.ObserverV1;
import org.example.week2.observer.interfaces.ObserverV2;
import org.example.week2.observer.interfaces.VideoEvent;

public class SubscriberV2 implements ObserverV2 {

    private String name;

    public SubscriberV2(String name) {
        this.name = name;
    }

    @Override
    public void update(VideoEvent videoEvent) {
        System.out.println(name + "에게 알림 보냄. " + videoEvent.toString());
    }
}
