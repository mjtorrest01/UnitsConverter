import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import CurrencyConverter.CurrencyFunctionality;
import DistanceConverter.DistanceFunctionality;

public class AppUnitsConverter {
    public static void main(String[] args) {
        UIManager.put("OptionPane.messageFont", new Font("Segoe UI", Font.ITALIC, 18));
        UIManager.put("OptionPane.messageForeground", Color.BLACK);
        UIManager.put("Button.background", Color.white);

        CurrencyFunctionality currency = new CurrencyFunctionality();
        DistanceFunctionality distance = new DistanceFunctionality();

        boolean key = true;

        while (key){
            String conversionOption = (JOptionPane.showInputDialog(null, "Menu de Conversor", "CONVERSOR DE UNIDADES",
            JOptionPane.QUESTION_MESSAGE, null,
            new Object[]{
                "Conversor de Divisas",
                "Conversor de Distancias" }, "Seleccione el Tipo de Conversor")).toString();

            switch (conversionOption) {
                case "Conversor de Divisas":
                    String valueQuantity = JOptionPane.showInputDialog("Ingrese el Monto a Convertir");

                    if (moneyValue(valueQuantity) & (valueQuantity != null) & valueQuantity.matches("[0-9]\\d*(\\.\\d+)?$")) {
                        double myValueAmount = Double.parseDouble(valueQuantity);
                        currency.covertCurrency(myValueAmount);
                        int selection1 = JOptionPane.showConfirmDialog(null, "¿Desea Reakizar Otra Conversion?");
                            if (JOptionPane.OK_OPTION == selection1) {
                                System.out.println("OK_OPTION Selecionado");
                            } else {
                                key = false;
                                JOptionPane.showMessageDialog(null, "Cerrando APP");
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
}
