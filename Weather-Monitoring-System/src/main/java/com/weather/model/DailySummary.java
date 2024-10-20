package com.weather.model;

import jakarta.persistence.*;

@Entity
public class DailySummary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private double averageTemperature;
    private double maxTemperature;
    private double minTemperature;
    private String dominantWeather;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getAverageTemperature() {
		return averageTemperature;
	}
	public void setAverageTemperature(double averageTemperature) {
		this.averageTemperature = averageTemperature;
	}
	public double getMaxTemperature() {
		return maxTemperature;
	}
	public void setMaxTemperature(double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
	public double getMinTemperature() {
		return minTemperature;
	}
	public void setMinTemperature(double minTemperature) {
		this.minTemperature = minTemperature;
	}
	public String getDominantWeather() {
		return dominantWeather;
	}
	public void setDominantWeather(String dominantWeather) {
		this.dominantWeather = dominantWeather;
	}

    // Getters and setters
    
}
