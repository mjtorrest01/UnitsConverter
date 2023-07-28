package SpeedConverter;

import javax.swing.JOptionPane;

public class SpeedOperation {
    public void speedConverter(double value, String unit, double conversionRatio, String nomenclature, String operation){
        double convertedSpeed;

        if (operation == "m") {

            convertedSpeed = value * conversionRatio;
            convertedSpeed = (double) Math.round(convertedSpeed*1000d)/1000;
            JOptionPane.showMessageDialog(null, value + " " + unit + " = " + convertedSpeed + nomenclature + ".");

        } else if (operation == "d"){

            convertedSpeed = value / conversionRatio;
            convertedSpeed = (double) Math.round(convertedSpeed*1000d)/1000;
            JOptionPane.showMessageDialog(null, value + " " + unit + " = " + convertedSpeed + nomenclature + ".");
        }
    }
}
