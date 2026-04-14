package org.example.week3.singleton;
public class SynchronizedGameSettings {
    private static SynchronizedGameSettings uniqueInstance;

    private boolean bgmOn;
    private String difficulty;

    private SynchronizedGameSettings() {
        bgmOn = true;
        difficulty = "NORMAL";
    }

    public static synchronized SynchronizedGameSettings getInstance() {
        if (uniqueInstance == null) {
            System.out.println("SynchronizedGameSettings 인스턴스를 생성합니다.");
            uniqueInstance = new SynchronizedGameSettings();
        }
        System.out.println("SynchronizedGameSettings 인스턴스를 반환합니다.");
        return uniqueInstance;
    }

    public boolean isBgmOn() {
        return bgmOn;
    }

    public void setBgmOn(boolean bgmOn) {
        this.bgmOn = bgmOn;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}