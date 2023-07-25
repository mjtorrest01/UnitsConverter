package CurrencyConverter;

import javax.swing.JOptionPane;

public class CurrencyFunctionality {
    
    double balboaToUSD = 1.00;
    double usdToBalboa = 1.00;
    double balboaToCAD = 1.37;
    double cadToBalboa = 0.73;
    double balboaToMXN = 18.60;
    double mxnToBalboa = 0.054;
    double balboaToEUR = 0.93;
    double eurToBalboa = 1.03;
    double balboaToGBP = 0.82;
    double gbpToBalboa = 1.22;
    double balboaToJPY = 132.44;
    double jpyToBalboa = 0.0076;
    double balboaToARS = 205.01;
    double arsToBalboa = 0.0049;
    double balboaToKRW = 1294.66;
    double krwToBalboa = 0.00077;

    CurrencyOperation conversion = new CurrencyOperation();

    public void covertCurrency(double amount) {

    String currencyConversion = (JOptionPane.showInputDialog(null, "Elija la convercion a realizar", 
    "Converciones de Divisas", JOptionPane.QUESTION_MESSAGE, null,
    new Object[] {  "Balboa a Dolar Americano",
                    "Dolar Americano a Balboa",
                    "Balboa a Dolar Canadience",
                    "Dolar Canadience a Balboa",
                    "Balboa a Pesos Mexicanos",
                    "Pesos Mexicanos a Balboa",
                    "Balboa a Euros",
                    "Euros a Balboa",
                    "Balboa a Libras Esterlinas",
                    "Libras Esterlinas a Balboa",
                    "Balboa a Yen",
                    "Yen a Balboa",
                    "Balboa a Pesos Argentinos",
                    "Pesos Argentinos a Balboa",
                    "Balboa a Won Sur Coreano",
                    "Won Sur Coreano a Balboa" }, "Seleccion")).toString();

        switch (currencyConversion) {
            case "Balboa a Dolar Americano":
                conversion.convertCurrency(amount, "Balboa", balboaToUSD, "Dolares Americanos", "$");
                break;
            case "Dolar Americano a Balboa":
                conversion.convertCurrency(amount, "Balboa", usdToBalboa, "Balboas", "B/.");
                break;
            case "Balboa a Dolar Canadience":
                conversion.convertCurrency(amount, "Balboa", balboaToCAD, "Dolares Americanos", "$");
                break;
            case "Dolar Canadience a Balboa":
                conversion.convertCurrency(amount, "Balboa", cadToBalboa, "Balboas", "B/.");
                break;
            case "Balboa a Pesos Mexicanos":
                conversion.convertCurrency(amount, "Balboa", balboaToMXN, "Dolares Americanos", "$");
                break;
            case "Pesos Mexicanos a Balboa":
                conversion.convertCurrency(amount, "Balboa", mxnToBalboa, "Balboas", "B/.");
                break;
            case "Balboa a Euros":
                conversion.convertCurrency(amount, "Balboa", balboaToEUR, "Dolares Americanos", "$");
                break;
            case "Euros a Balboa":
                conversion.convertCurrency(amount, "Balboa", eurToBalboa, "Balboas", "B/.");
                break;
            case "Balboa a Libras Esterlinas":
                conversion.convertCurrency(amount, "Balboa", balboaToGBP, "Dolares Americanos", "$");
                break;
            case "Libras Esterlinas a Balboa":
                conversion.convertCurrency(amount, "Balboa", gbpToBalboa, "Balboas", "B/.");
                break;
            case "Balboa a Yen":
                conversion.convertCurrency(amount, "Balboa", balboaToJPY, "Dolares Americanos", "$");
                break;
            case "Yen a Balboa":
                conversion.convertCurrency(amount, "Balboa", jpyToBalboa, "Balboas", "B/.");
                break;
            case "Balboa a Pesos Argentinos":
                conversion.convertCurrency(amount, "Balboa", balboaToARS, "Dolares Americanos", "$");
                break;
            case "Pesos Argentinos a Balboa":
                conversion.convertCurrency(amount, "Balboa", arsToBalboa, "Balboas", "B/.");
                break;
            case "Balboa a Won Sur Coreano":
                conversion.convertCurrency(amount, "Balboa", balboaToKRW, "Dolares Americanos", "$");
                break;
            case "Won Sur Coreano a Balboa":
                conversion.convertCurrency(amount, "Balboa", krwToBalboa, "Balboas", "B/.");
                break;
        }
    }
}