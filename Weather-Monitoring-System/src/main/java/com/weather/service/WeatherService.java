package com.weather.service;

import com.weather.model.DailySummary;
import com.weather.model.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
public class WeatherService {

    @Value("${openweathermap.api.key}")
    private String apiKey;

    private final String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apikey}&units=metric";

    @Autowired
    private DatabaseService databaseService; // Injecting DatabaseService

    public void fetchAndStoreWeatherData(String city) {
        RestTemplate restTemplate = new RestTemplate();
        WeatherData weatherData = restTemplate.getForObject(apiUrl, WeatherData.class, city, apiKey);

        if (weatherData != null && weatherData.getMain() != null) {
            DailySummary summary = calculateDailySummary(weatherData);
            databaseService.saveDailySummary(summary); // Save to database
        }
    }

    private DailySummary calculateDailySummary(WeatherData weatherData) {
        DailySummary summary = new DailySummary();
        summary.setDate(LocalDate.now().toString());
        summary.setAverageTemperature(weatherData.getMain().getTemp());
        summary.setMaxTemperature(weatherData.getMain().getTemp()); // Update this logic as per actual data collection
        summary.setMinTemperature(weatherData.getMain().getTemp()); // Update this logic as per actual data collection
        summary.setDominantWeather(weatherData.getWeather()[0].getMain());

        return summary;
    }
}
