package converter;

public class Main {
	public static void main(String[] args) {
		
		Converter converter = new Converter();
		
		converter.getCelsius().insertTemperature();
		converter.getFahrenheit().insertTemperature();
		converter.getKelvin().insertTemperature();
		converter.getRankine().insertTemperature();
		
		
		converter.celsiusToFahrenheit();
		converter.fahrenheitToCelsius();
		converter.fahrenheitToKelvin();
		converter.celsiusToKelvin();
		converter.kelvinToCelsius();
		converter.kelvinToFahrenheit();
		converter.celsiusToRankine();
		converter.fahrenheitToRankine();
		converter.kelvinToRankine();
		converter.rankineToCelsius();
		converter.rankineToFahrenheit();
		converter.rankineToKelvin();
		
	}	
}
