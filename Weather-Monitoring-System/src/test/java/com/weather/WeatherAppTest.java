package com.weather;

import com.weather.model.WeatherData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherAppTest {

    @Test
    public void testTemperatureConversion() {
        // Creating a WeatherData object for testing
        WeatherData.Main main = new WeatherData.Main();
        main.setTemp(25.0); // Set temperature in Celsius

        WeatherData weatherData = new WeatherData();
        weatherData.setMain(main); // Set the Main object

        assertEquals(25.0, weatherData.getMain().getTemp()); // Assert the temperature
    }
}
