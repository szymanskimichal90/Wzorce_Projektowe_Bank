package account.card;

import account.card.type.CreditCardType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class CreditCard {

    private CreditCardType creditCardType;
    private String number;
    private String expirationDate;
    private double balance;
    private double maxCredit;

    public CreditCard(CreditCardType creditCardType, String number, String expirationDate, double balance, double maxCredit) {
        this.creditCardType = creditCardType;
        this.number = number;
        this.expirationDate = expirationDate;
        this.balance = balance;
        this.maxCredit = maxCredit;
    }

 }
