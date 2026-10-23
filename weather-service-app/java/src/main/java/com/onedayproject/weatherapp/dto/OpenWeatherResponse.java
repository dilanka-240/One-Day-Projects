package com.onedayproject.weatherapp.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record OpenWeatherResponse(
    String name,
    Main main,
    List<WeatherDescription> weatherDescription,
    Wind wind) {
  public record Main(double temp, double feel_like, int humidity, double pressure) {
  }

  public record WeatherDescription(String main, String description, String icon) {
  }

  public record Wind(double speed, double deg) {
  }
}
