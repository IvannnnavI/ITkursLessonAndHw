package lesson_24.hW_24.Task_0;
/*
Платежные системы Создайте интерфейс PaymentSystem с методами transferMoney,
 withdrawMoney и checkBalance. Реализуйте классы BankAccount и ElectronicWallet,
которые реализуют данный интерфейс. Убедитесь, что каждый класс корректно выполняет каждую из операций.
 */

public interface PaymentSystem {
    void transferMoney(PaymentSystem recipient, double amount,String currency);

    void withdrawMoney(double amount, String currency);
    void depositMoney(double amount,String currency);
    double checkBalance(String currency);
}
