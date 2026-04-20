package org.example.week4.adapter;

import org.example.week4.adapter.controller.DualSenseController;
import org.example.week4.adapter.controller.DualShock4Controller;

public class WithoutAdapterPattern {

    public void play() {
        playWithPs5();
        playWithPs4();
    }

    private void playWithPs5() {
        DualSenseController controller = new DualSenseController();
        controller.pressCross();
        controller.pressCircle();
        controller.pressSquare();
        controller.pressTriangle();
        controller.pressL1();
        controller.pressR1();
    }

    private void playWithPs4() {
        DualShock4Controller controller = new DualShock4Controller();
        controller.pressCross();
        controller.pressCircle();
        controller.pressSquare();
        controller.pressTriangle();
    }
}
