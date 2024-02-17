package lesson_24.hW_24.Task_0;

public class BankAccount implements PaymentSystem {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void transferMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Переведено: " + amount);
        }else {
            System.out.println("Недостаточно средств для перевода.");
        }

    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Cнято: " + amount);
        }else {
            System.out.println("Недостаточно средств для осуществления операции.");
        }

    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
