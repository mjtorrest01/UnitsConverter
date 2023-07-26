package SpeedConverter;

import javax.swing.JOptionPane;

public class SpeedFunctionality {

    double nudoToMph = 1.151;
    double nudoToKmh = 1.852;
    double mphToKmh = 1.60934;

    SpeedOperation converter = new SpeedOperation();
    
    public void velocityConverter(double valueSpeed) {
        String speedOption = (JOptionPane.showInputDialog(null, "Elija la convercion a realizar", "Opciones de convercion", 
        JOptionPane.QUESTION_MESSAGE, null, 
        new Object[] {  "Nudo a mph",
                        "Nudo a Km/h",
                        "mph a Nudo",
                        "mph a Km/h",
                        "Km/h a Nudo",
                        "Km/h a mph" }, "Selecion")).toString();

        switch (speedOption) {
            case "Nudo a mph":
                converter.speedConverter(valueSpeed, "Nudos", nudoToMph, "mph", "m"); // multiplica
                break;
            case "Nudo a Km/h":
                converter.speedConverter(valueSpeed, "Nudos", nudoToKmh, "Km/h", "m"); // mutiplica
                break;
            case "mph a Nudo":
                converter.speedConverter(valueSpeed, "mph", nudoToMph, "Nudo", "d"); // dividir
                break;
            case "mph a Km/h":
                converter.speedConverter(valueSpeed, "mph", mphToKmh, "Km/h", "m"); // multiplica
                break;
            case "Km/h a Nudo":
                converter.speedConverter(valueSpeed, "Km/h", nudoToKmh, "Nudo", "d"); // divide
                break;
            case "Km/h a mph":
                converter.speedConverter(valueSpeed, "Km/h", mphToKmh, "mph", "d"); // divide
                break;
        }
    }
}
