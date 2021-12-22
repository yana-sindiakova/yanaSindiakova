package oldTasks.Lesson2;

public class Temperature {
    public static void main(String[] args) {
        int tFahrenheit = 100;
        int tCelsius = 5 * (tFahrenheit - 32) / 9;
        double tKelvin = tCelsius + 273.16;
        System.out.println("Temperature in Fahrenheit = " + tFahrenheit + "; in Celsius = " + tCelsius + "; in Kelvin = " + tKelvin);
    }
}
