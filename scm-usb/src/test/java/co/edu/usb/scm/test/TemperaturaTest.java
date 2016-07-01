package co.edu.usb.scm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.usb.scm.Temperatura;
import co.edu.usb.scm.TemperaturaImpl;

public class TemperaturaTest {

	/*@Test
	public void testFahrenheitCelsius() {
		Temperatura t = new TemperaturaImpl();
		System.out.println(t.FahrenheitCelsius(4));
		assertTrue(t.FahrenheitCelsius(4) >= 10);
		
	}*/

	@Test
	public void testCelsiusFahrenheit() {
		Temperatura t = new TemperaturaImpl();
		System.out.println(t.CelsiusFahrenheit(4));
		assertTrue(t.CelsiusFahrenheit(4)>1);
	}

}

