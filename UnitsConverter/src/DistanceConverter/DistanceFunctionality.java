package DistanceConverter;

import javax.swing.JOptionPane;

public class DistanceFunctionality {
    
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
                                                                                        "Decimetros a Centimetros",
                                                                                        "Decimetros a Milimetros",
                                                                                        "Decimetros a Metros",
                                                                                        "Centimetros a Pulgadas",
                                                                                        "Centimetros a Decimetros",
                                                                                        "Centimetros a Milimetros",
                                                                                        "Milimetros a Decimetros",
                                                                                        "Milimetros a Centimetros" },
                                                                                        "Seleccion")).toString();
    }
}
