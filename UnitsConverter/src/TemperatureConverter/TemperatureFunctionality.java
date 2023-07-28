package TemperatureConverter;

import javax.swing.JOptionPane;

public class TemperatureFunctionality {
    public void convertTemperature (double valueTemperature) {
        String temperatureOptions = (JOptionPane.showInputDialog(null, "Elija la convercion a realizar", 
        "Converciones de Temperatura", JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{   "Fahrenheit a Kelvin",
                        "Fahrenheit a Celcius",
                        "Kelvin a Fahrenheit",
                        "Kelvin a Celcius",
                        "Celcius a Fahrenheit",
                        "Celcius a Kelvin" }, "seleccion")).toString();

        switch (temperatureOptions) {
            case "Fahrenheit a Kelvin":
                double fahrenheitToKelvin = ((5 * (valueTemperature - 32)) / 9) + 273.15;
                fahrenheitToKelvin = (double) Math.round(fahrenheitToKelvin * 100d) / 100;
                JOptionPane.showMessageDialog(null, valueTemperature + " °F = " + fahrenheitToKelvin + " °K" );
                break;
            case "Fahrenheit a Celcius":
                double fahrenheitToCelcius = ((5 * (valueTemperature - 32)) / 9);
                fahrenheitToCelcius = (double) Math.round(fahrenheitToCelcius * 100d) / 100;
                JOptionPane.showMessageDialog(null, valueTemperature + " °F = " + fahrenheitToCelcius + " °C" );
                break;
            case "Kelvin a Fahrenheit":
                double kelvinTofahrenheit = (((9 * (valueTemperature - 273.15)) / 5) + 32);
                kelvinTofahrenheit = (double) Math.round(kelvinTofahrenheit * 100d) / 100;
                JOptionPane.showMessageDialog(null, valueTemperature + " °K = " + kelvinTofahrenheit + " °F" );
                break;
            case "Kelvin a Celcius":
                double kelvinToCelcius = valueTemperature - 273.15;
                kelvinToCelcius = (double) Math.round(kelvinToCelcius * 100d) / 100;
                JOptionPane.showMessageDialog(null, valueTemperature + " °K = " + kelvinToCelcius + " °K" );
                break;
            case "Celcius a Fahrenheit":
                double celciusToFahrenheit = (((valueTemperature * 9) / 5) + 32);
                celciusToFahrenheit = (double) Math.round(celciusToFahrenheit * 100d) / 100;
                JOptionPane.showMessageDialog(null, valueTemperature + " °C = " + celciusToFahrenheit + " °F" );
                break;
            case "Celcius a Kelvin":
                double celciusToKelvin = valueTemperature + 273.15;
                celciusToKelvin = (double) Math.round(celciusToKelvin * 100d) / 100;
                JOptionPane.showMessageDialog(null, valueTemperature + " °C = " + celciusToKelvin + " °K" );
                break;
        }
    }
}
