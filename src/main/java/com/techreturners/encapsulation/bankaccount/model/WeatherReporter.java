package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;
    private final int MIN_FAHRENHEIT_TEMP=32;
    private final double TEMP_CONVERSION_CONST=(9.0 / 5.0);
    private final int  HOT_TEMP_LIMIT=30;
    private final int COLD_TEMP_LIMIT=10;


    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String displayWeather() {

        double covertToFahrenheit = TEMP_CONVERSION_CONST * temperature + MIN_FAHRENHEIT_TEMP;
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.",
                location, weatherSymbolBasedOnLocation(), weatherBasedOnTemperature(), covertToFahrenheit);

    }

    private String weatherSymbolBasedOnLocation() {
        if (location.equals("London")) {

            return "🌦";

        } else if (location.equals("California")) {

            return "🌅";

        } else if (location.equals("Cape Town")) {

            return "🌤";

        }
        return "🔆";
    }

    private String weatherBasedOnTemperature() {
        if (temperature > HOT_TEMP_LIMIT) {

            return "It's too hot 🥵!";

        } else if (temperature < COLD_TEMP_LIMIT) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

}
