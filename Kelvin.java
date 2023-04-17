package converter;
import java.util.Scanner;

public class Kelvin {
	private double temperature;
	Scanner input = new Scanner(System.in);
	
	public double getTemperature() {
		return temperature;
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void insertTemperature() {
		System.out.println("Insert temperature Kelvin:");
		this.temperature = input.nextDouble();
	}
}
