package CurrencyConverter;

import javax.swing.JOptionPane;

public class CurrencyFunctionality {
    
    // actualizado 08/13/2023 

    double balboaToUSD = 1.00;
    double usdToBalboa = 1.00;
    double balboaToCAD = 1.34;
    double cadToBalboa = 0.75;
    double balboaToMXN = 16.97;
    double mxnToBalboa = 0.059;
    double balboaToEUR = 0.91;
    double eurToBalboa = 1.10;
    double balboaToGBP = 0.79;
    double gbpToBalboa = 1.27;
    double balboaToJPY = 145.00;
    double jpyToBalboa = 0.0069;
    double balboaToARS = 286.12;
    double arsToBalboa = 0.0035;
    double balboaToKRW = 1326.00;
    double krwToBalboa = 0.00075;

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
                conversion.convertCurrency(amount, "Dolares Americanos", usdToBalboa, "Balboas", "B/.");
                break;
            case "Balboa a Dolar Canadience":
                conversion.convertCurrency(amount, "Balboa", balboaToCAD, "Dolar Canadience", "CAD");
                break;
            case "Dolar Canadience a Balboa":
                conversion.convertCurrency(amount, "Dolar Canadience", cadToBalboa, "Balboas", "B/.");
                break;
            case "Balboa a Pesos Mexicanos":
                conversion.convertCurrency(amount, "Balboa", balboaToMXN, "Pesos Mexicanos", "MXN$");
                break;
            case "Pesos Mexicanos a Balboa":
                conversion.convertCurrency(amount, "Pesos Mexicanos", mxnToBalboa, "Balboas", "B/.");
                break;
            case "Balboa a Euros":
                conversion.convertCurrency(amount, "Balboa", balboaToEUR, "Euros", "\u20AC");
                break;
            case "Euros a Balboa":
                conversion.convertCurrency(amount, "Euros", eurToBalboa, "Balboas", "B/.");
                break;
            case "Balboa a Libras Esterlinas":
                conversion.convertCurrency(amount, "Balboa", balboaToGBP, "Libras Esterlinas", "\u00A3");
                break;
            case "Libras Esterlinas a Balboa":
                conversion.convertCurrency(amount, "Libras Esterlinas", gbpToBalboa, "Balboa", "B/.");
                break;
            case "Balboa a Yen":
                conversion.convertCurrency(amount, "Balboa", balboaToJPY, "Yenes Japoneses", "\u00A5");
                break;
            case "Yen a Balboa":
                conversion.convertCurrency(amount, "Yenes Japoneses", jpyToBalboa, "Balboas", "B/.");
                break;
            case "Balboa a Pesos Argentinos":
                conversion.convertCurrency(amount, "Balboa", balboaToARS, "Pesos Argentinos", "ARG$");
                break;
            case "Pesos Argentinos a Balboa":
                conversion.convertCurrency(amount, "Pesos Argentinos", arsToBalboa, "Balboas", "B/.");
                break;
            case "Balboa a Won Sur Coreano":
                conversion.convertCurrency(amount, "Balboa", balboaToKRW, "Won Sur Coreanos", "w\u014Fn");
                break;
            case "Won Sur Coreano a Balboa":
                conversion.convertCurrency(amount, "Won Sur Coreanos", krwToBalboa, "Balboas", "B/.");
                break;
        }
    }
}