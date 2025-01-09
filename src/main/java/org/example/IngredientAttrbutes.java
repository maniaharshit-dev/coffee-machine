package org.example;

public class IngredientAttrbutes{
    int volume;
    int temperature;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public IngredientAttrbutes(int volume, int temperature) {
        this.volume = volume;
        this.temperature = temperature;
    }
}
