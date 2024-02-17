package lesson_24.hW_24.Task_0;
/*
Платежные системы Создайте интерфейс PaymentSystem с методами transferMoney,
 withdrawMoney и checkBalance. Реализуйте классы BankAccount и ElectronicWallet,
которые реализуют данный интерфейс. Убедитесь, что каждый класс корректно выполняет каждую из операций.
 */

public interface PaymentSystem {
    void transferMoney(double amount);
    void withdrawMoney(double amount);
    double checkBalance();
}
