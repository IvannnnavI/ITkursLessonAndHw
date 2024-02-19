package lesson_24.hW_24.Task_0;

public class BankAccount implements PaymentSystem {private double balance; // Баланс в EUR для упрощения
    private String currency = "EUR";

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void transferMoney(PaymentSystem recipient, double amount, String currency) {
        double amountInEUR = CurrencyExchange.convert(amount, currency, this.currency);
        if (amountInEUR <= balance) {
            balance -= amountInEUR;
            recipient.depositMoney(amountInEUR, this.currency);
            System.out.println("Переведено " + amountInEUR + " " + this.currency);
        } else {
            System.out.println("Недостаточно средств для перевода.");
        }
    }

    @Override
    public void withdrawMoney(double amount, String currency) {
        double amountInEUR = CurrencyExchange.convert(amount, currency, this.currency);
        if (amountInEUR <= balance) {
            balance -= amountInEUR;
            System.out.println("Снято " + amountInEUR + " " + this.currency);
        } else {
            System.out.println("Недостаточно средств для снятия.");
        }
    }

    @Override
    public void depositMoney(double amount, String currency) {
        double amountInEUR = CurrencyExchange.convert(amount, currency, this.currency);
        balance += amountInEUR;
        System.out.println("Внесено " + amountInEUR + " " + this.currency);
    }

    @Override
    public double checkBalance(String currency) {
        return CurrencyExchange.convert(balance, this.currency, currency);
    }
}


