package lesson_24.hW_24.Task_0;

public class ElectronicWallet implements PaymentSystem {
    private double balance; // Предполагаем, что баланс в BTC для упрощения
    private String currency = "BTC";

    public ElectronicWallet(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void transferMoney(PaymentSystem recipient, double amount, String currency) {
        double amountInBTC = CurrencyExchange.convert(amount, currency, this.currency);
        if (amountInBTC <= balance) {
            balance -= amountInBTC;
            recipient.depositMoney(amountInBTC, this.currency);
            System.out.println("Переведено " + amountInBTC + " " + this.currency);
        } else {
            System.out.println("Недостаточно средств для перевода.");
        }
    }

    @Override
    public void withdrawMoney(double amount, String currency) {
        double amountInBTC = CurrencyExchange.convert(amount, currency, this.currency);
        if (amountInBTC <= balance) {
            balance -= amountInBTC;
            System.out.println("Снято " + amountInBTC + " " + this.currency);
        } else {
            System.out.println("Недостаточно средств для снятия.");
        }
    }

    @Override
    public void depositMoney(double amount, String currency) {
        double amountInBTC = CurrencyExchange.convert(amount, currency, this.currency);
        balance += amountInBTC;
        System.out.println("Пополнено " + amountInBTC + " " + this.currency + ". Новый баланс: " + balance + " " + this.currency);
    }

    @Override
    public double checkBalance(String currency) {
        return CurrencyExchange.convert(balance, this.currency, currency);
    }
}