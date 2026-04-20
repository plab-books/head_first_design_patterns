package org.example.week4.adapter.controller;

public class DualSenseController implements Ps5Controller {
    @Override public void pressCross() { System.out.println(" PS5 공격 "); }
    @Override public void pressCircle() { System.out.println(" PS5 방어 "); }
    @Override public void pressSquare() { System.out.println(" PS5 점프 "); }
    @Override public void pressTriangle() { System.out.println(" PS5 구르기 "); }
    @Override public void pressL1() { System.out.println(" PS5 대쉬 "); }
    @Override public void pressR1() { System.out.println(" PS5 협동 "); }
}
