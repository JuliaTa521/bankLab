package tech.reliab.course.taranovaja.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class PaymentAccount {
    /**
     *Id платёжного счета
     */
    private int paymentAccountId;

    /**
     *Пользователь, за которым закреплен этот платежный счет
     */
    private User userPaymentAccount;

    /**
     *Название банка, в котором открыт этот счет
     */
    private String paymentAccountBankName ;

    /**
     *Сумма, которая лежит в данный момент на счету (по умолчанию 0)
     */
    private int sumPaymentAccount;

    public PaymentAccount() {
    }

    public PaymentAccount(int paymentAccountId, User userPaymentAccount, String paymentAccountBankName)
    {
        this.paymentAccountId=paymentAccountId;
        this.userPaymentAccount=userPaymentAccount;
        this.paymentAccountBankName=paymentAccountBankName;
        this.sumPaymentAccount=0;
    }

    @Override
    public String toString() {
        return "\n\nПользователь, за которым закреплен платежный счет "+this.userPaymentAccount.getFioUser()+
                "\nНазвание банка, в котором открыт этот счет "+this.paymentAccountBankName  +
                "\nСумма, которая лежит в данный момент на счету "+this.sumPaymentAccount;
    }
}
