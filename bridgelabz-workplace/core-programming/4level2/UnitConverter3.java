public class UnitConverter3 {

    // Temperature Conversions
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Weight Conversions
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Volume Conversions
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    // Main method to test conversions
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = 37.0;
        double pounds = 150.0;
        double kilograms = 68.0;
        double gallons = 5.0;
        double liters = 10.0;

        System.out.println(fahrenheit + "°F = " + convertFahrenheitToCelsius(fahrenheit) + "°C");
        System.out.println(celsius + "°C = " + convertCelsiusToFahrenheit(celsius) + "°F");

        System.out.println(pounds + " lbs = " + convertPoundsToKilograms(pounds) + " kg");
        System.out.println(kilograms + " kg = " + convertKilogramsToPounds(kilograms) + " lbs");

        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");
        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");
    }
}
