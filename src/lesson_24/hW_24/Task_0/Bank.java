package lesson_24.hW_24.Task_0;

public class Bank {
    public static void main(String[] args) {// Создаем банковский счет и электронный кошелек с начальным балансом
        BankAccount bankAccount = new BankAccount(1000); // Баланс в EUR
        ElectronicWallet eWallet = new ElectronicWallet(0.5); // Баланс в BTC

        System.out.println("Начальный баланс банковского счета (EUR): " + bankAccount.checkBalance("EUR"));
        System.out.println("Начальный баланс электронного кошелька (BTC): " + eWallet.checkBalance("BTC"));

        // Попытка перевода средств с банковского счета на электронный кошелек
        System.out.println("\nПеревод 100 EUR с банковского счета на электронный кошелек в BTC:");
        bankAccount.transferMoney(eWallet, 100, "EUR");

        // Проверка балансов после перевода
        System.out.println("Баланс банковского счета после перевода (EUR): " + bankAccount.checkBalance("EUR"));
        System.out.println("Баланс электронного кошелька после перевода (BTC): " + eWallet.checkBalance("BTC"));

        // Попытка снятия средств с электронного кошелька
        System.out.println("\nСнятие 0.01 BTC с электронного кошелька:");
        eWallet.withdrawMoney(0.01, "BTC");

        // Пополнение банковского счета
        System.out.println("\nПополнение банковского счета на 500 EUR:");
        bankAccount.depositMoney(500, "EUR");

        // Проверка баланса банковского счета после пополнения
        System.out.println("Баланс банковского счета после пополнения (EUR): " + bankAccount.checkBalance("EUR"));

        // Попытка выполнить операцию с неизвестной валютой
        System.out.println("\nПопытка перевода в неизвестной валюте 'XYZ':");
        bankAccount.transferMoney(eWallet, 10, "XYZ");

        // Попытка перевода средств при недостаточном балансе
        System.out.println("\nПопытка перевода 2000 EUR с банковского счета на электронный кошелек, когда недостаточно средств:");
        bankAccount.transferMoney(eWallet, 2000, "EUR");

        System.out.println("==========================================");

        bankAccount.depositMoney(100,"PGK");
        bankAccount.checkBalance("EUR");
    }
}
