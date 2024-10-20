package com.weather.service;

import org.springframework.stereotype.Service;

import com.weather.model.WeatherData;

@Service
public class AlertService {

    private double temperatureThreshold = 35.0;

    public void checkForAlerts(WeatherData weatherData) {
        double currentTemp = weatherData.getMain().getTemp();
        
        if (currentTemp > temperatureThreshold) {
            System.out.println("Alert! Temperature exceeded threshold: " + currentTemp);
        }
        
        // Optional: Display the current weather condition
        if (weatherData.getWeather() != null && weatherData.getWeather().length > 0) {
            System.out.println("Current weather condition: " + weatherData.getWeather()[0].getDescription());
        }
    }
}
