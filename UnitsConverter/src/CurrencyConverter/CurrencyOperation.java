package CurrencyConverter;

import javax.swing.JOptionPane;

public class CurrencyOperation {
    public void convertCurrency(double value, String coin, double equivalent, String nomenclature , String symbol ) {
        double convertdValue = value * equivalent;
        convertdValue = (double) Math.round(convertdValue*100d/100);
        JOptionPane.showMessageDialog(null, value + " " + coin + " = " + symbol + convertdValue + " " + nomenclature + ".");
    }
}
