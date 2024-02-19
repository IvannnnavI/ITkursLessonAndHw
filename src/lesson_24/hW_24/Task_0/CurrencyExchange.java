package lesson_24.hW_24.Task_0;

public class CurrencyExchange {
    public static double convert(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency.equals(toCurrency)) {
            return amount; // Нет необходимости в конвертации, если валюты совпадают
        }

        double rateFrom = getRate(fromCurrency);
        double rateTo = getRate(toCurrency);

        double amountInBase = amount / rateFrom; // Конвертируем в базовую валюту (EUR), если fromCurrency не EUR
        return amountInBase * rateTo; // Конвертируем из базовой валюты (EUR) в toCurrency, если toCurrency не EUR
    }

    private static double getRate(String currency) {
        switch (currency) {
            case "BTC": return 20000;
            case "EUR": return 1;
            case "PGK": return 0.3;
            default:
                System.out.println("Внимание: Неизвестная валюта '" + currency + "'.");
                return 0;
        }
    }

}
