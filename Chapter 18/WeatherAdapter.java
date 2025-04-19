public class WeatherAdapter implements WeatherProvider {
    private ExternalWeatherService externalService;

    public WeatherAdapter(ExternalWeatherService service) {
        this.externalService = service;
    }

    @Override
    public String fetchForecast() {
        // Adapting the external method to our internal method signature
        return externalService.getWeatherData();
    }
}
