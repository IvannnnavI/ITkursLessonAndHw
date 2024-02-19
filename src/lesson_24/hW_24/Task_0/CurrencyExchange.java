package lesson_24.hW_24.Task_0;

public class CurrencyExchange {
    public static double convert(double amount, String fromCurrency, String toCurrency) {
        System.out.println("Конвертация: " + amount + " из " + fromCurrency + " в " + toCurrency);

        if (fromCurrency.equals(toCurrency)) {
            return amount;
        }

        double rateFrom = getRate(fromCurrency);
        double rateTo = getRate(toCurrency);

        System.out.println("Курс из " + fromCurrency + " в EUR: " + rateFrom);
        System.out.println("Курс из EUR в " + toCurrency + ": " + rateTo);

        double amountInEUR = (fromCurrency.equals("EUR")) ? amount : amount / rateFrom;
        double convertedAmount = (toCurrency.equals("EUR")) ? amountInEUR : amountInEUR / rateTo;

        System.out.println("Результат конвертации: " + convertedAmount + " " + toCurrency);
        return convertedAmount;
    }

    private static double getRate(String currency) {
        switch (currency) {
            case "BTC": return 20000; // 1 BTC = 20000 EUR
            case "EUR": return 1;     // 1 EUR = 1 EUR
            case "PGK": return 0.3;   // 1 PGK = 0.3 EUR
            default:
                System.err.println("Unknown currency: " + currency);
                return 0;
        }
    }

}
