package com.company;

public class Sweet extends Product {
    private int volume;

    public Sweet(int volume) {
        this.volume = volume;
    }

    public Sweet() {
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}