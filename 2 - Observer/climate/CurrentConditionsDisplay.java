package climate;

import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	Observable observable;
	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentConditionsDisplay(Observable observable){
		this.observable = observable;
		this.observable.addObserver(this);
	}

	public void display(){		
		System.out.println("Current Conditions - Temperature: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure);
	}

	public void update(Observable obs, Object arg){
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}		
	}
}