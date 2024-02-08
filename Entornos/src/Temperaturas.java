//Miguel Angel Romero Lopez
public class Temperaturas {
    public static double celsiusAFahrenheit(double celsius) {

        return (celsius * 9/5) + 32;
    }

    public static double celsiusAKelvin(double celsius) {

        return celsius + 273.15;
    }

    public static double fahrenheitACelsius(double fahrenheit) {

        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitAKelvin(double fahrenheit) {

        return (fahrenheit + 459.67) * 5/9;
    }

    public static double kelvinACelsius(double kelvin) {

        return kelvin - 273.15;
    }

    public static double kelvinAFahrenheit(double kelvin) {

        return (kelvin * 9/5) - 459.67;
    }

}

