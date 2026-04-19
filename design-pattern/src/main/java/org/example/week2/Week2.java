package org.example.week2;

import org.example.week2.decorator.decorators.Mocha;
import org.example.week2.decorator.decorators.Soy;
import org.example.week2.decorator.decorators.Whip;
import org.example.week2.decorator.drink.DarkRoast;
import org.example.week2.decorator.drink.Espresso;
import org.example.week2.decorator.drink.HouseBlend;
import org.example.week2.decorator.interfaces.Beverage;
import org.example.week2.observer.interfaces.VideoEvent;
import org.example.week2.observer.observer.SubscriberV1;
import org.example.week2.observer.observer.SubscriberV2;
import org.example.week2.observer.subject.YoutuberV1;
import org.example.week2.observer.subject.YoutuberV2;

public class Week2 {

    public static void  main(String[] args) {
        Week2 week2 = new Week2();
        week2.observerPattern();
//        week2.decoratorPattern();
    }

    public void observerPattern() {
        // 주체
        YoutuberV1 youtuberV1 = new YoutuberV1();

        // 우리 구독이들~
        SubscriberV1 s1 = new SubscriberV1("박기현");
        SubscriberV1 s2 = new SubscriberV1("심보경");
        SubscriberV1 s3 = new SubscriberV1("김태훈");
        SubscriberV1 s4 = new SubscriberV1("박종훈");
        youtuberV1.subscribe(s1);
        youtuberV1.subscribe(s2);
        youtuberV1.subscribe(s3);
        youtuberV1.subscribe(s4);

        // 업로드 해야징
        youtuberV1.uploadVideo("헤드퍼스트 디자인패턴 : 옵저버 패턴");

        // 개별로네 구독 해지해야지
        youtuberV1.unsubscribe(s2);

        // 다시 개쩌는 비디오 업로드
        youtuberV1.uploadVideo("토스 코드 유출 : 범인은 허X");

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        // V2
        // 주체
        YoutuberV2 youtuberV2 = new YoutuberV2();

        // 우리 구독이들~
        SubscriberV2 s11 = new SubscriberV2("박기현");
        SubscriberV2 s12 = new SubscriberV2("심보경");
        SubscriberV2 s13 = new SubscriberV2("김태훈");
        SubscriberV2 s14 = new SubscriberV2("박종훈");
        youtuberV2.subscribe(s11);
        youtuberV2.subscribe(s12);
        youtuberV2.subscribe(s13);
        youtuberV2.subscribe(s14);

        // 업로드 해야징
        youtuberV2.uploadVideo(new VideoEvent("헤드퍼스트 디자인패턴", "내용123", 123456, "VIDEO"));

        // 개별로네 구독 해지해야지
        youtuberV2.unsubscribe(s12);

        // 다시 개쩌는 비디오 업로드
        youtuberV2.uploadVideo(new VideoEvent("토스 코드 유출 : 범인은 허X", "기밀내용", 123, "POST"));
    }

    public void decoratorPattern() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
