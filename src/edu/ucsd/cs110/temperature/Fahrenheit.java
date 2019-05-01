package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    float temp = 0;
    public Fahrenheit(float t)
    {
        super(t);
        this.temp = t;
    }

    @Override
    public Temperature toCelsius() {
        float t = (float) ((this.temp  - 32)/1.8);
        Temperature toReturn = new Celsius(t);
        return toReturn;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature toReturn = new Fahrenheit(this.temp);
        return toReturn;
    }

    public String toString()
    {
        return ("" + this.temp + " F");
    }
}