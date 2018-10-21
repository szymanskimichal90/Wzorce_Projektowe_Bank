package user;

import account.BankAccount;

import java.util.HashMap;

/**
 * Singleton pattern.
 */
public class UserRepository {
    private static UserRepository instance;

    private HashMap<String,User> users;

    /**
     * Singleton pattern.
     */
    public static UserRepository getInstance(){
        if(instance == null) {
            synchronized (UserRepository.class) {
                if(instance == null) {
                    instance = new UserRepository();
                }
            }
        }
        return instance;
    }

    private UserRepository(){
        users = new HashMap<>();
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

        User userOne = new User("Jan Kowalski",bankAccountOne);
        User userTwo = new User("Andrzej Badura", bankAccountTwo);
        User userThree = new User("Bob Nowak",bankAccountThree);

        users.put(userOne.getFullName(),userOne);
        users.put(userTwo.getFullName(),userTwo);
        users.put(userThree.getFullName(),userThree);


    }

    public HashMap<String, User> getUsers() {
        return users;
    }
}
