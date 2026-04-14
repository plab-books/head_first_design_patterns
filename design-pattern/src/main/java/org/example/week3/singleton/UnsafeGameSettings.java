package org.example.week3.singleton;

public class UnsafeGameSettings {
    private static UnsafeGameSettings uniqueInstance;

    private boolean bgmOn;
    private String difficulty;

    private UnsafeGameSettings() {
        this.bgmOn = true;
        this.difficulty = "NORMAL";
    }

    public static UnsafeGameSettings getInstance() {
        if (uniqueInstance == null) {
            System.out.println("UnsafeGameSettings 인스턴스를 생성합니다.");
            uniqueInstance = new UnsafeGameSettings();
        }
        System.out.println("UnsafeGameSettings 인스턴스를 반환합니다.");
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
