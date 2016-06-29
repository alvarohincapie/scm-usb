package co.edu.usb.scm;

public class TemperaturaImpl implements Temperatura {
	
	public double FahrenheitCelsius(double grado) {
		double gCelsius = (grado - 32) / 1.8;
		return gCelsius;
	}

	public double CelsiusFahrenheit(double grado) {
		double gFahrenheit = (grado * 1.8) + 32;
		return gFahrenheit;
	}
}
