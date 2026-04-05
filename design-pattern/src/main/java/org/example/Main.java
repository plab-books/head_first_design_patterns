package org.example;

import org.example.week2.observer.observer.Subscriber;
import org.example.week2.observer.subject.Youtuber;

public class Main {
    public static void main(String[] args) {
        // 주체
        Youtuber youtuber = new Youtuber();
        
        // 우리 구독이들~
        Subscriber s1 = new Subscriber("박기현");
        Subscriber s2 = new Subscriber("심보경");
        Subscriber s3 = new Subscriber("김태훈");
        Subscriber s4 = new Subscriber("박종훈");
        youtuber.subscribe(s1);
        youtuber.subscribe(s2);
        youtuber.subscribe(s3);
        youtuber.subscribe(s4);
        
        // 업로드 해야징
        youtuber.uploadVideo("헤드퍼스트 디자인패턴 : 옵저버 패턴");

        // 개별로네 구독 해지해야지
        youtuber.unsubscribe(s2);

        // 다시 개쩌는 비디오 업로드
        youtuber.uploadVideo("토스 코드 유출 : 범인은 허X");
    }
}