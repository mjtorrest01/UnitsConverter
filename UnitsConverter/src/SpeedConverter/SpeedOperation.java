package SpeedConverter;

import javax.swing.JOptionPane;

public class SpeedOperation {
    public void speedConverter(double value, String unit, double conversionRatio, String nomenclature, String operation){
        double convertedDistance;

        if (operation == "m") {

            convertedDistance = value * conversionRatio;
            convertedDistance = (double) Math.round(convertedDistance*1000d)/1000;
            JOptionPane.showMessageDialog(null, value + " " + unit + " = " + convertedDistance + nomenclature + ".");

        } else if (operation == "d"){

            convertedDistance = value / conversionRatio;
            convertedDistance = (double) Math.round(convertedDistance*1000d)/1000;
            JOptionPane.showMessageDialog(null, value + " " + unit + " = " + convertedDistance + nomenclature + ".");
        }
    }
}
