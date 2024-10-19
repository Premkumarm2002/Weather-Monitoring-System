package com.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledWeatherFetcher {

    @Autowired
    private WeatherService weatherService;

    // Fetch weather data every 5 minutes
    @Scheduled(fixedRate = 300000)
    public void fetchWeatherData() {
        weatherService.fetchAndStoreWeatherData("Hyderabad"); // You can modify to fetch for other cities as needed
    }
}
