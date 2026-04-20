package org.example.week4.adapter;

import org.example.week4.adapter.controller.DualSenseController;
import org.example.week4.adapter.controller.DualShock4Controller;
import org.example.week4.adapter.controller.Ps4ToPs5Adapter;
import org.example.week4.adapter.controller.Ps5Controller;

public class AdapterPattern {
    public void play() {
        Ps5Controller ps5 = new DualSenseController();
        play(ps5);
        System.out.println();
        DualShock4Controller ps4 = new DualShock4Controller();
        Ps5Controller adapterPs4 = new Ps4ToPs5Adapter(ps4);
        play(adapterPs4);
    }

    public void play(Ps5Controller controller) {
        System.out.println("=== 게임 시작 ===");
        controller.pressCross();
        controller.pressCircle();
        controller.pressSquare();
        controller.pressTriangle();
        controller.pressL1();
        controller.pressR1();
        System.out.println("=== 게임 종료 ===");
        System.out.println();
    }
}
