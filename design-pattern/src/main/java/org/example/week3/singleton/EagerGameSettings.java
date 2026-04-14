package org.example.week3.singleton;
public class EagerGameSettings {
    private static final EagerGameSettings uniqueInstance = new EagerGameSettings();

    private boolean bgmOn;
    private String difficulty;

    private EagerGameSettings() {
        bgmOn = true;
        difficulty = "NORMAL";
    }

    public static EagerGameSettings getInstance() {
        System.out.println("Returning instance of EagerGameSettings");
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
