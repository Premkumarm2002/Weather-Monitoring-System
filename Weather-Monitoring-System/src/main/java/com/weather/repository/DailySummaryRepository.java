package com.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weather.model.DailySummary;

public interface DailySummaryRepository extends JpaRepository<DailySummary, Long> {
}
