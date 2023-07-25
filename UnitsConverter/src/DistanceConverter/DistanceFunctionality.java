package DistanceConverter;

import javax.swing.JOptionPane;

public class DistanceFunctionality {

    double lightYearsToMiles = 5.879e+12;
    double lightYearsToKilometers = 9.461e+12; 
    double kilometersToMilles = 1.609344;
    double kilometersToMeters = 1000;
    double metersToMiles = 1609.34;
    double metersToFeet = 3.2808399;
    double metersToInches = 39.3700787;
    double metersToCentimeters = 100;
    double feetToInches = 12;
    double feerToCentimeters = 30.48;
    double inchesToCentimeters = 2.54;
    
    DistanceOperation converter = new DistanceOperation();

    public void convertMeasures (double measure) {

        String distanceMeasures = (JOptionPane.showInputDialog(null, "Elija la convercion a realizar", 
        "Converciones de Distancia", JOptionPane.QUESTION_MESSAGE, null,
        new Object[] {  "Años Luz a Millas",
                        "Años Luz a Kilometros",
                        "Kilometros a Años Luz",
                        "Kilometros a Millas",
                        "Kilometros a Metros",
                        "Metros a Millas",
                        "Metros a Kilometros",
                        "Metros a Pies",
                        "Metros a Pulgadas",
                        "Metros a Centimetros",
                        "Pies a Metros",
                        "Pies a Pulgadas",
                        "Pies a Centimetros",
                        "Pulgadas a Metros",
                        "Pulgadas a Pies",
                        "Pulgadas a Centimetros",
                        "Centimetros a Metros",
                        "Centimetros a Pulgadas",
                        "Centimetros a Pies" }, "Seleccion")).toString();

        switch (distanceMeasures) {
            case "Años Luz a Millas":
                converter.DistanceConverter(measure, "Años Luz", lightYearsToMiles, "MI (Millas)", 1); // Multiplica
                break;
            case "Años Luz a Kilometros":
                converter.DistanceConverter(measure, "Años Luz", lightYearsToKilometers, "KM (Kilometros)", 1); // Multiplica
                break;
            case "Kilometros a Años Luz":
                converter.DistanceConverter(measure, "Kilometros", lightYearsToKilometers, "AL (Años Luz)", 2); // Divide
                break;
            case "Kilometros a Millas":
                converter.DistanceConverter(measure, "Kilometros", kilometersToMilles, "MI (Millas)", 2); // Divide
                break;
            case "Kilometros a Metros":
                converter.DistanceConverter(measure, "Kilometros", kilometersToMeters, "M (Metros)", 1); // Multiplica
                break;
            case "Metros a Millas":
                converter.DistanceConverter(measure, "Metros", metersToMiles, "MI (Millas)", 2); // Divide
                break;
            case "Metros a Kilometros":
                converter.DistanceConverter(measure, "Metros", kilometersToMeters, "KM (Kilometros)", 2); // Divide
                break;
            case "Metros a Pies":
                converter.DistanceConverter(measure, "Metros", metersToFeet, "FT (Pies)", 1); // Multiplica
                break;
            case "Metros a Pulgadas":
                converter.DistanceConverter(measure, "Metros", metersToInches, "IN (Pulgadas)", 1); // Multiplica
                break;
            case "Metros a Centimetros":
            converter.DistanceConverter(measure, "Metros", metersToCentimeters, "CM (Centimetros)", 1); // Multiplica
                break;
            case "Pies a Metros":
                converter.DistanceConverter(measure, "Pies", metersToFeet, "M (Metros)", 2); // Divide
                break;
            case "Pies a Pulgadas":
            converter.DistanceConverter(measure, "Pies", feetToInches, "IN (Pulgadas)", 1); // Multiplica
                break;
            case "Pies a Centimetros":
                converter.DistanceConverter(measure, "Pies", feerToCentimeters, "CM (Centimetros)", 1); // Multiplica
                break;
            case "Pulgadas a Metros":
                converter.DistanceConverter(measure, "Pulgadas", metersToInches, "M (Metros)", 2); // Divide
                break;
            case "Pulgadas a Pies":
                converter.DistanceConverter(measure, "Pulgadas", feetToInches, "FT (Pies)", 1); // Divide
                break;
            case "Pulgadas a Centimetros":
                converter.DistanceConverter(measure, "Pulgadas", inchesToCentimeters, "CM (Centimetros)", 1); // Multiplica
                break;
            case "Centimetros a Metros":
            converter.DistanceConverter(measure, "Centimetros", metersToCentimeters, "M (Metros)", 2); // Divide
                break;
            case "Centimetros a Pies":
                converter.DistanceConverter(measure, "Centimetros", feerToCentimeters, "FT (Pies)", 2); // Divide
                break;
            case "Centimetros a Pulgadas":
                converter.DistanceConverter(measure, "Centimetros", inchesToCentimeters, "IN (Pulgadas)", 2); // Divide
                break;
        }
    }
}
