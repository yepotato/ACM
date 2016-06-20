package Design.observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData= weatherData;
		weatherData.registerObserver(this);
		
	}
	
	@Override
	public void display() {
		System.out.println("temp:"+temperature+"\t humidity"+humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public Subject getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(Subject weatherData) {
		this.weatherData = weatherData;
	}

	

}
