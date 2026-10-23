package com.onedayproject.weatherapp.dto;

import java.io.Serializable;
import java.time.Instant;

public record WeatherResponse(
    String city,
    double temperatureCelsius,
    double feelsLikeCelsius,
    int humidityPercentage,
    double windSpeedMeterSec,
    String condition,
    String description,
    Instant timestamp,
    boolean fromCache
) implements Serializable {}
