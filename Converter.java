package converter;

public class Converter {
	private Celsius celsius;
	private Fahrenheit fahrenheit;
	private Kelvin kelvin;
	private Rankine rankine;
	
	public Converter() {
		this.celsius = new Celsius();
		this.fahrenheit = new Fahrenheit();
		this.kelvin = new Kelvin();
		this.rankine = new Rankine();
	}
	
	public Celsius getCelsius() {
		return celsius;
	}
	
	public void setCelsius(Celsius celsius) {
		this.celsius = celsius;
	}
	
	public Fahrenheit getFahrenheit() {
		return fahrenheit;
	}
	
	public void setFahrenheit(Fahrenheit fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	public Kelvin getKelvin() {
		return kelvin;
	}
	
	public void setKelvin(Kelvin kelvin) {
		this.kelvin = kelvin;
	}
	
	public Rankine getRankine() {
		return rankine;
	}
	
	public void setRankine(Rankine rankine) {
		this.rankine = rankine;
	}
	
	public void celsiusToFahrenheit() {
		double fahrenheit = (celsius.getTemperature() * 1.8) + 32;
		System.out.println("Its temperature in Fahrenheit is :" + fahrenheit);
	}
	
	public void celsiusToKelvin() {
		double kelvin = celsius.getTemperature() + 273.15;
		System.out.println("Its temperature in Kelvin is :" + kelvin);
	}
	
	public void celsiusToRankine() {
		double rankine = (celsius.getTemperature() * 9/5) + 491.67;
		System.out.println("Its temperature in Rankine is :" + rankine);
	}
	
	public void fahrenheitToCelsius() {
		double celsius = (fahrenheit.getTemperature() - 32) / 1.8;
		System.out.println("Its temperature in Celsius is :" + celsius);
	}
	
	public void fahrenheitToKelvin() {
		double kelvin = (fahrenheit.getTemperature() - 32) * 5/9 + 273.15;
		System.out.println("Its temperature in Kelvin is :" + kelvin);
	}
	
	public void fahrenheitToRankine() {
		double rankine = fahrenheit.getTemperature() + 459.67;
		System.out.println("Its temperature in Rankine is :" + rankine);
	}
	
	public void kelvinToCelsius() {
		double celsius = kelvin.getTemperature() - 273.15;
		System.out.println("Its temperature in Celsius is :" + celsius);
	}
	
	public void kelvinToFahrenheit() {
		double fahrenheit = (kelvin.getTemperature() - 273.15) * 1.8  + 32;
		System.out.println("Its temperature in Fahrenheit is :" + fahrenheit);
	}
	
	public void kelvinToRankine() {
		double rankine = kelvin.getTemperature() * 1.8;
		System.out.println("Its temperature in Rankine is :" + rankine);
	}
	
	public void rankineToCelsius() {
		double celsius = (rankine.getTemperature() - 491.67) / 1.8;
		System.out.println("Its temperature in Celsius is :" + celsius);
	}
	
	public void rankineToFahrenheit() {
		double fahrenheit = rankine.getTemperature() - 459.67;
		System.out.println("Its temperature in Fahrenheit is :" + fahrenheit);
	}
	
	public void rankineToKelvin() {
		double kelvin = rankine.getTemperature() / 1.8;
		System.out.println("Its temperature in Kelvin is :" + kelvin);
	}
}
