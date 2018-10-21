package account;

public class AccountService {

    public void withdraw(BankAccount sourceBankAccount, double amount) {
        if (amount > 0) {
            if ((sourceBankAccount.getBalance() - amount) >= 0) {
                sourceBankAccount.setBalance(sourceBankAccount.getBalance() - amount);
                System.out.println("Success");
            } else {
                System.out.println("You have not enough money");
            }
        }
    }

    public void deposit(BankAccount targetBankAccount, double amount) {
        if (amount > 0) {
            targetBankAccount.setBalance(targetBankAccount.getBalance() + amount);
            System.out.println("Success");
        }
    }

}
