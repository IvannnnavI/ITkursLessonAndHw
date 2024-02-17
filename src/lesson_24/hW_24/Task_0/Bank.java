package lesson_24.hW_24.Task_0;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        ElectronicWallet eWallet = new ElectronicWallet(500);

        bankAccount.transferMoney(150);
        eWallet.withdrawMoney(75);

        System.out.println("Bank Account balance: " + bankAccount.checkBalance());
        System.out.println("E-Wallet balance: " + eWallet.checkBalance());

        bankAccount.withdrawMoney(1500);
        eWallet.transferMoney(700);
    }
}
