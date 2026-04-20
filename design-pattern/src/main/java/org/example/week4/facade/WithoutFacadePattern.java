package org.example.week4.facade;

import org.example.week4.facade.system.*;

public class WithoutFacadePattern {
    public void play() {
        System.out.println("=== 게임 시스템 초기화 ===");
        GraphicsSystem graphics = new GraphicsSystem();
        SoundSystem sound = new SoundSystem();
        PhysicsSystem physics = new PhysicsSystem();
        NetworkSystem network = new NetworkSystem();
        UISystem ui = new UISystem();

        graphics.init();
        sound.init();
        physics.init();
        network.connect();
        ui.load();
        System.out.println("=== 게임 시스템 초기화 완료 ===");

        System.out.println("=== 게임 시작! ===");
    }
}
