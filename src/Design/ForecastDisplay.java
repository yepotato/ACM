//package Design;
//
//import java.util.Observable;
//import java.util.Observer;
//
//import Design.observer.DisplayElement;
//import Design.observer.WeatherData;
//
//public class ForecastDisplay implements Observer,DisplayElement {
//	private float currentPressure = 29.92f;  
//	private float lastPressure;
//	public ForecastDisplay(Observable observable) {
//		observable.addObserver(this);
//	}
//	
//
//	@Override
//	public void display() {
//		
//	}
//
//	public void update(Observable observable, Object arg) {
//		if (observable instanceof WeatherData) {
//			WeatherData weatherData = (WeatherData)observable;
//			lastPressure = currentPressure;
//			currentPressure = weatherData.getPressure();
//			display();
//		}
//		
//	}
//
//}
