package climate;

public class WeatherStation {
	public static void main(String args[]){
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(1,2,3);
		weatherData.setMeasurements(34,2,1);
	}
}