package lesson_24.hW_24.Task_0;

public class BankAccount implements PaymentSystem {
    private double balance;
    private String currency = "EUR";

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void transferMoney(PaymentSystem recipient, double amount, String currency) {
        double amountInAccCurrency = CurrencyExchange.convert(amount, currency, this.currency);
        if (amountInAccCurrency > balance) {
            System.out.println("Недостаточно средств для перевода.");
            return;
        }
        balance -= amountInAccCurrency;
        double amountInRecipientCurrency = CurrencyExchange.convert(amountInAccCurrency, this.currency, currency);
        recipient.depositMoney(amountInRecipientCurrency, currency);
        System.out.println("Переведено " + amount + " " + currency);
    }

    @Override
    public void withdrawMoney(double amount, String currency) {
        double amountInAccountCurrency = CurrencyExchange.convert(amount, currency, this.currency);
        if (amountInAccountCurrency > balance) {
            System.out.println("Недостаточно средств для снятия.");
            return;
        }
        balance -= amountInAccountCurrency;
        System.out.println("Снято " + amount + " " + currency);
    }

    @Override
    public void depositMoney(double amount, String currency) {
        double amountInWalletCurrency = CurrencyExchange.convert(amount, currency, this.currency);
        balance += amountInWalletCurrency;
        System.out.println("После пополнения на " + amount + " " + currency + ", банковского счета: " + balance + " " + this.currency);

    }

    @Override
    public double checkBalance(String currency) {
        return CurrencyExchange.convert(balance, this.currency, currency);
    }
}


