package org.example.week4.facade.system;

public class SystemFacade {
    private final GraphicsSystem graphicsSystem;
    private final SoundSystem soundSystem;
    private final PhysicsSystem physicsSystem;
    private final NetworkSystem networkSystem;
    private final UISystem uiSystem;

    public SystemFacade() {
        this.graphicsSystem = new GraphicsSystem();
        this.soundSystem = new SoundSystem();
        this.physicsSystem = new PhysicsSystem();
        this.networkSystem = new NetworkSystem();
        this.uiSystem = new UISystem();
    }

    public void init() {
        graphicsSystem.init();
        soundSystem.init();
        physicsSystem.init();
        networkSystem.connect();
        uiSystem.load();
        System.out.println("=== 게임 시스템 초기화 완료 ===");
        System.out.println();
    }
}
