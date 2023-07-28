import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import CurrencyConverter.CurrencyFunctionality;
import DistanceConverter.DistanceFunctionality;
import SpeedConverter.SpeedFunctionality;

public class AppUnitsConverter {
    public static void main(String[] args) {
        UIManager.put("OptionPane.messageFont", new Font("Segoe UI", Font.ITALIC, 18));
        UIManager.put("OptionPane.messageForeground", Color.BLACK);
        UIManager.put("Button.background", Color.white);

        CurrencyFunctionality currency = new CurrencyFunctionality();
        DistanceFunctionality distance = new DistanceFunctionality();
        SpeedFunctionality Speed = new SpeedFunctionality();

        boolean key = true;

        while (key){
            String conversionOption = (JOptionPane.showInputDialog(null, "Menu de Conversor", "CONVERSOR DE UNIDADES",
            JOptionPane.QUESTION_MESSAGE, null,
            new Object[]{
                "Conversor de Divisas",
                "Conversor de Distancias", 
                "Conversor de Velocidad" }, "Seleccione el Tipo de Conversor")).toString();

            switch (conversionOption) {
                case "Conversor de Divisas":
                    String valueQuantity = JOptionPane.showInputDialog("Ingrese el Monto a Convertir");

                    if (moneyValue(valueQuantity) & (valueQuantity != null) & valueQuantity.matches("[0-9]\\d*(\\.\\d+)?$")) {
                        double myValueAmount = Double.parseDouble(valueQuantity);
                        currency.covertCurrency(myValueAmount);
                        int selection1 = JOptionPane.showConfirmDialog(null, "¿Desea Realizar Otra Conversion?");
                            if (JOptionPane.OK_OPTION == selection1) {
                                System.out.println("OK_OPTION Selecionado");
                            } else {
                                key = false;
                                JOptionPane.showMessageDialog(null, "Cerrando APP");
                                break;
                            }
                            break;
                    } else {
                        System.out.println("Solo Debes Introducir Valores Numericos");
                        JOptionPane.showMessageDialog(null, "Valor Introducidos no Permitidos, Vuleva a Intentar");
                        break;
                    }
                case "Conversor de Distancias":
                    String measurementDistance = JOptionPane.showInputDialog("Ingrese la Distancia a Convertir");

                    if (valueDistance(measurementDistance) & (measurementDistance != null) & measurementDistance.matches("[0-9]\\d*(\\.\\d+)?$")) {
                        double myDistanceMeasure = Double.parseDouble(measurementDistance);
                        distance.convertMeasures(myDistanceMeasure);
                        int selection2 = JOptionPane.showConfirmDialog(null, "¿Desea Realizar Otra Conversion?");
                            if (JOptionPane.OK_OPTION == selection2) {
                                System.out.println("OK_OPTION Selecionado");
                            } else {
                                key = false;
                                JOptionPane.showMessageDialog(null, "Cerrando APP");
                                break;
                            }
                            break;
                    } else {
                        System.out.println("Solo Debes Introducir Valores Numericos");
                        JOptionPane.showMessageDialog(null, "Valor Introducidos no Permitidos, Vuleva a Intentar");
                        break;
                    }
                case "Conversor de Velocidad":
                    String recordedSpeed = JOptionPane.showInputDialog("Digite la Velocidad a convertir");

                    if (valueSpeed(recordedSpeed) & (recordedSpeed != null) & (recordedSpeed.matches("[0-9]\\d*(\\.\\d+)?$"))) {
                        double myRegisteredSpeed = Double.parseDouble(recordedSpeed);
                        Speed.velocityConverter(myRegisteredSpeed);
                        int selection3 = JOptionPane.showConfirmDialog(null, "¿Desea Realizar Otra Conversion?");
                            if (JOptionPane.OK_OPTION == selection3) {
                                System.out.println("OK_OPTION Selecionado");
                            } else {
                                key = false;
                                JOptionPane.showMessageDialog(null, "Cerrando APP");
                                break;
                            }
                            break;
                    } else {
                        System.out.println("Solo Debes Introducir Valores Numericos");
                        JOptionPane.showMessageDialog(null, "Valor Introducidos no Permitidos, Vuleva a Intentar");
                        break;
                    }
            }
        }
    }

    private static boolean moneyValue(String valueQuantity) {
        return true;
    }

    private static boolean valueDistance(String measurementDistance) {
        return true;
    }
    
    private static boolean valueSpeed(String recordedSpeed) {
        return true;
    }
}
