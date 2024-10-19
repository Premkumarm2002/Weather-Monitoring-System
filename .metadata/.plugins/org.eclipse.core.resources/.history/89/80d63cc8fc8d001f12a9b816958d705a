package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherData {
    @JsonProperty("main")
    private Main main;

    @JsonProperty("weather")
    private Weather[] weather;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public static class Main {
        private double temp;
        private double feels_like;

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getFeelsLike() {
            return feels_like;
        }

        public void setFeelsLike(double feels_like) {
            this.feels_like = feels_like;
        }
    }

    public static class Weather {
        private String main;
        private String description;

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
