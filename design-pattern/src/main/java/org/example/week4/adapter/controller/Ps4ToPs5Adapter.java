package org.example.week4.adapter.controller;

public class Ps4ToPs5Adapter implements Ps5Controller{
    private final DualShock4Controller ps4;

    public Ps4ToPs5Adapter(DualShock4Controller ps4) {
        this.ps4 = ps4;
    }

    @Override public void pressCross() { ps4.pressCross(); }
    @Override public void pressCircle() { ps4.pressCircle(); }
    @Override public void pressSquare() { ps4.pressSquare(); }
    @Override public void pressTriangle() { ps4.pressTriangle(); }
    @Override public void pressL1() {
        System.out.println(" PS4에는 L1 버튼이 없습니다. ");
//        throw  new UnsupportedOperationException(" PS4에는 L1 버튼이 없습니다. ");
    }
    @Override public void pressR1() {
        System.out.println(" PS4에는 R1 버튼이 없습니다. ");
//        throw  new UnsupportedOperationException(" PS4에는 R1 버튼이 없습니다. ");
    }
}
