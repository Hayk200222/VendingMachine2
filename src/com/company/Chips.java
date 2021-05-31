package com.company;

public class Chips extends Product {
    private int volume;

    public Chips(int volume) {
        this.volume = volume;
    }

    public Chips() {
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
