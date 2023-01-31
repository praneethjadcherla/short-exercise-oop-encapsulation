package com.techreturners.encapsulation.WeatherReporter;

import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherReporterTest {

    @Test
    public void checkWeatherforLondonAndIsCold() {
        WeatherReporter weather = new WeatherReporter("London", 7);

        assertEquals("I am in London and it is 🌦. It's too cold 🥶!. The temperature in Fahrenheit is 44.6.", weather.displayWeather());
    }

    @Test
    public void checkWeatherforCaliforniaAndIsHot() {
        WeatherReporter weather = new WeatherReporter("California", 31);

        assertEquals("I am in California and it is 🌅. It's too hot 🥵!. The temperature in Fahrenheit is 87.8.", weather.displayWeather());
    }

    @Test
    public void checkWeatherforCapetownAndIsRightTemp() {
        WeatherReporter weather = new WeatherReporter("Cape Town", 20);

        assertEquals("I am in Cape Town and it is 🌤. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 68.", weather.displayWeather());
    }

    @Test
    public void checkWeatherforInvalidLocationAndIsRightTemp() {
        WeatherReporter weather = new WeatherReporter("Florida", 10);

        assertEquals("I am in Florida and it is 🔆. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 50.", weather.displayWeather());
    }
}
