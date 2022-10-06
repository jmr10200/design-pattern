package hello.example.designpattern.observer.weather;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentTemperature = 26.56f;
    private float lastTemperature;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // 옵저버 등록
    }
    public void update(float temp, float humidity, float pressure) {
        lastTemperature = currentTemperature;
        currentTemperature = temp;

        display();
    }

    public void display() {
        System.out.print("기상예보 = ");
        if (currentTemperature > lastTemperature) {
            System.out.println("어제보다 기온이 높아 따뜻합니다.");
        } else if (currentTemperature == lastTemperature) {
            System.out.println("어제와 비슷한 기온의 날씨입니다.");
        } else if (currentTemperature < lastTemperature) {
            System.out.println("기온이 내려가 어제보다 쌀쌀합니다.");
        }
    }
}
