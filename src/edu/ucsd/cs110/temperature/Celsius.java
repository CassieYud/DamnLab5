package edu.ucsd.cs110.temperature;

import java.awt.*;

public class Celsius extends Temperature {
    float temp = 0;
    public Celsius(float t) {
        super(t);
        this.temp = t;
    }

    @Override
    public Temperature toCelsius() {
        Temperature toReturn = new Celsius(this.temp);
        return toReturn;
    }

    @Override
    public Temperature toFahrenheit() {
        float t = (float) (this.temp * 1.8 + 32);
        Temperature toReturn = new Fahrenheit(0);
        return toReturn;
    }

    public String toString() {
        return ("" + this.temp + " C");

    }
}