package DistanceConverter;

import javax.swing.JOptionPane;

public class DistanceOperation {
    
    public void DistanceConverter(double value, String unit, double conversionRatio, String nomenclature, double type){
        double convertedDistance;

        if (type == 1) {

            convertedDistance = value * conversionRatio;
            convertedDistance = (double) Math.round(convertedDistance*1000d)/1000;
            JOptionPane.showMessageDialog(null, value + " " + unit + " = " + convertedDistance + nomenclature + ".");

        } else if (type == 2){

            convertedDistance = value / conversionRatio;
            convertedDistance = (double) Math.round(convertedDistance*1000d)/1000;
            JOptionPane.showMessageDialog(null, value + " " + unit + " = " + convertedDistance + nomenclature + ".");
        }
    }
}
