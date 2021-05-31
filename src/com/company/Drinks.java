package com.company;

public class Drinks extends Product {
    private int volume;

    public Drinks(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public Drinks() {
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

