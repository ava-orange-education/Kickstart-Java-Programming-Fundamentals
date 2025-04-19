public class AdapterPatternExample {
    public static void main(String[] args) {
        ExternalWeatherService external = new ExternalWeatherService();
        WeatherProvider adapter = new WeatherAdapter(external);

        System.out.println("Today's Forecast: " + adapter.fetchForecast());
    }
}