//Miguel Angel Romero Lopez

import static org.junit.jupiter.api.Assertions.*;

class TemperaturasTest {

    @org.junit.jupiter.api.Test
    void celsiusAFahrenheit() {
        double celsius = 0.0;
        double expectedFahrenheit = 32.0;

        double actualFahrenheit = Temperaturas.celsiusAFahrenheit(celsius);

        assertEquals(expectedFahrenheit, actualFahrenheit, 0.0001);
    }


    @org.junit.jupiter.api.Test
    void celsiusAKelvin() {
        double celsius = 0.0;
        double expectedKelvin = 273.15;

        double actualKelvin = Temperaturas.celsiusAKelvin(celsius);

        assertEquals(expectedKelvin, actualKelvin, 0.0001);
    }

    @org.junit.jupiter.api.Test
    void fahrenheitACelsius() {
        double fahrenheit = 32.0;
        double expectedCelsius = 0.0;

        double actualCelsius = Temperaturas.fahrenheitACelsius(fahrenheit);

        assertEquals(expectedCelsius, actualCelsius, 0.0001);
    }

    @org.junit.jupiter.api.Test
    void fahrenheitAKelvin() {
        double fahrenheit = 32.0;
        double expectedKelvin = 273.15;

        double actualKelvin = Temperaturas.fahrenheitAKelvin(fahrenheit);

        assertEquals(expectedKelvin, actualKelvin, 0.0001);
    }

    @org.junit.jupiter.api.Test
    void kelvinACelsius() {
        double kelvin = 273.15;
        double expectedCelsius = 0.0;

        double actualCelsius = Temperaturas.kelvinACelsius(kelvin);

        assertEquals(expectedCelsius, actualCelsius, 0.0001);
    }

    @org.junit.jupiter.api.Test
    void kelvinAFahrenheit() {
        double kelvin = 273.15;
        double expectedFahrenheit = 32.0;

        double actualFahrenheit = Temperaturas.kelvinAFahrenheit(kelvin);

        assertEquals(expectedFahrenheit, actualFahrenheit, 0.0001);
    }

}