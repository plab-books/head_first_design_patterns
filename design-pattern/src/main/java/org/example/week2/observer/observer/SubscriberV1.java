package org.example.week2.observer.observer;

import org.example.week2.observer.interfaces.ObserverV1;

public class SubscriberV1 implements ObserverV1 {

    private String name;

    public SubscriberV1(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + "에게 알림 보냄. " + videoTitle + "업로드가 되었습니다.");
    }
}
