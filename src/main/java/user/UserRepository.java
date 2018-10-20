package user;

import account.BankAccount;

import java.util.HashMap;

public class UserRepository {
    private HashMap<String,User> users;

    public UserRepository(){
        /*BankAccount bankAccountOne = new BankAccount("111111111111111122222222","1010",
        "Safety BANK","John Account1010",0.0,null,
                false,null,null,true);*/

        BankAccount bankAccountOne = BankAccount
                .builder("111111111111111122222222")
                .addAccountCode("1010")
                .addBalance(3000.0)
                .addAccountName("John Account1010")
                .addBankName("Safety BANK").build();

        BankAccount bankAccountTwo = BankAccount
                .builder("333333333333333344444444")
                .addAccountCode("2020")
                .addBankName("Safety BANK")
                .addAccountName("Andres Account2020")
                .build();

        BankAccount bankAccountThree = BankAccount
                .builder("333333333333333344444445")
                .addAccountCode("3020")
                .addBankName("Safety BANK")
                .addAccountName("Bob Account3020")
                .addDailyLimit(800)
                .build();





        User userOne = new User();
    }
}
