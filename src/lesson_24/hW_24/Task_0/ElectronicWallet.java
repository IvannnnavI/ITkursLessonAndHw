package lesson_24.hW_24.Task_0;

public class ElectronicWallet implements PaymentSystem {
    private double balance;

    public ElectronicWallet(double balance) {
        this.balance = balance;
    }

    @Override
    public void transferMoney(double amount) {
        if (amount <= balance){
            balance -= amount;
            System.out.println("Электронный кошелёк: Переведено: " + amount);
        }else {
            System.out.println("Электронный кошелек: Операция отклонена! Недостаточно средств для перевода.");
        }

    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance){
            balance -= amount;
            System.out.println("Электронный кошелёк: Снято: " + amount);
        }else {
            System.out.println("Электронный кошелек: Операция отклонена! Недостаточно средств для снятия.");
        }

    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
