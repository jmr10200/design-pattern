package hello.example.designpattern.observer.weather;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherDataTest {

    @Test
    void execute() {
        WeatherData weatherData = new WeatherData();
        // 옵저버 등록
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(20, 65, 30.4f);
        weatherData.setMeasurements(15, 70, 29.2f);
        weatherData.setMeasurements(32, 80, 27.2f);
        weatherData.setMeasurements(32, 90, 29.2f);

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(27, 78, 31.1f);
    }

}