package com.weather.service;

import com.weather.model.DailySummary;
import com.weather.repository.DailySummaryRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DatabaseService {
    
    @Autowired
    private DailySummaryRepository dailySummaryRepository;

    @Transactional
    public void saveDailySummary(DailySummary dailySummary) {
        dailySummaryRepository.save(dailySummary);
    }
}
