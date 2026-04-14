package org.example.week3.singleton;

public class DclGameSettings {
    private static volatile DclGameSettings uniqueInstance;

    private boolean bgmOn;
    private String difficulty;

    private DclGameSettings() {
        bgmOn = true;
        difficulty = "NORMAL";
    }

    public static DclGameSettings getInstance() {
        if (uniqueInstance == null) {
            synchronized (DclGameSettings.class) {
                if (uniqueInstance == null) {
                    System.out.println("DclGameSettings 인스턴스를 생성합니다.");
                    uniqueInstance = new DclGameSettings();
                }
            }
        }
        System.out.println("DclGameSettings 인스턴스를 반환합니다.");
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