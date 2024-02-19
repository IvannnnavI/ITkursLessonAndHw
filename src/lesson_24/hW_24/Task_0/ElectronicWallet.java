package lesson_24.hW_24.Task_0;

public class ElectronicWallet implements PaymentSystem {private double balance;
    private String currency = "BTC";

    public ElectronicWallet(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void transferMoney(PaymentSystem recipient, double amount, String currency) {
        double amountInWalletCurrency = CurrencyExchange.convert(amount, currency, this.currency);
        if (amountInWalletCurrency > balance) {
            System.out.println("Электронный кошелек: Недостаточно средств для перевода.");
            return;
        }
        balance -= amountInWalletCurrency;
        double amountInRecipientCurrency = CurrencyExchange.convert(amountInWalletCurrency, this.currency, currency);
        recipient.depositMoney(amountInRecipientCurrency, currency);
        System.out.println("Электронный кошелек: Переведено " + amount + " " + currency);
    }

    @Override
    public void withdrawMoney(double amount, String currency) {
        double amountInWalletCurrency = CurrencyExchange.convert(amount, currency, this.currency);
        if (amountInWalletCurrency > balance) {
            System.out.println("Электронный кошелек: Недостаточно средств для снятия.");
            return;
        }
        balance -= amountInWalletCurrency;
        System.out.println("Электронный кошелек: Снято " + amount + " " + currency);
    }

    @Override
    public void depositMoney(double amount, String currency) {
        double amountInWalletCurrency = CurrencyExchange.convert(amount, currency, this.currency);
        balance += amountInWalletCurrency;
        System.out.println("После пополнения на " + amount + " " + currency + ", баланс кошелька: " + balance + " " + this.currency);

    }

    @Override
    public double checkBalance(String currency) {
        return CurrencyExchange.convert(balance, this.currency, currency);
    }
}
