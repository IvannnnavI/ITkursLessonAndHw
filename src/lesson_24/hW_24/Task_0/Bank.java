package lesson_24.hW_24.Task_0;

public class Bank {
    public static void main(String[] args) {
        // Инициализация счетов
        BankAccount bankAccount = new BankAccount(1000); // Счет в EUR
        ElectronicWallet eWallet = new ElectronicWallet(0.05); // Кошелек в BTC

        // Пополнение электронного кошелька на 100 EUR
        System.out.println("\nПополнение электронного кошелька на 100 EUR:");
        eWallet.depositMoney(100, "EUR");

        // Проверка баланса электронного кошелька в BTC
        System.out.println("Баланс электронного кошелька в BTC: " + eWallet.checkBalance("BTC"));

        // Перевод 200 EUR с банковского счета на электронный кошелек
        System.out.println("\nПеревод 200 EUR с банковского счета на электронный кошелек:");
        bankAccount.transferMoney(eWallet, 200, "EUR");

        // Проверка баланса после перевода
        System.out.println("Баланс банковского счета в EUR после перевода: " + bankAccount.checkBalance("EUR"));
        System.out.println("Баланс электронного кошелька в BTC после перевода: " + eWallet.checkBalance("BTC"));

        // Попытка снятия средств с электронного кошелька в PGK
        System.out.println("\nПопытка снятия средств с электронного кошелька в PGK:");
        eWallet.withdrawMoney(1000, "PGK");

        // Проверка баланса электронного кошелька в EUR для демонстрации конвертации
        System.out.println("Баланс электронного кошелька в EUR: " + eWallet.checkBalance("EUR"));

        double convertTest = CurrencyExchange.convert(1,"EUR","BTC");
        System.out.println("1 EUR в биткоинах = " + convertTest);
    }
}
