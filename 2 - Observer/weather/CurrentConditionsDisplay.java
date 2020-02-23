package weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private Subject weatherData;
	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void display(){		
		System.out.println("Current Conditions - Temperature: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure);
	}

	public void update(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
}