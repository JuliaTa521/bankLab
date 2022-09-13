package tech.reliab.course.taranovaja.bank.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter

public class CreditAccount {
    /**
     * Id кредитного счета
     */
    private int creditAccountId;

    /**
     *Пользователь, за которым закреплен этот кредитный счет
     */
    private User userCreditAccount;

    /**
     *Название банка, где взят кредит
     */
    private String nameBankOffice;

    /**
     *Дата начала кредита
     */
    private LocalDate dateBeginCredit;

    /**
     *Дата окончания кредита
     */
    private LocalDate dateEndCredit;

    /**
     *Кол-во месяцев, на которые взят кредит
     */
    private int kolMonthCredit;

    /**
     *Сумма кредита
     */
    private int sumCredit;

    /**
     *Ежемесячный платеж
     */
    private int monthPaymentCredit;

    /**
     *Процентная ставка (должна быть равной процентной ставке банка, в котором взят кредит или ниже)
     */
    private int rateCredit;

    /**
     * Сотрудник, который выдал кредит
     */
    private Employee employeeCreditAccount;

    /**
     * Платежный счет в банке с которого будет осуществляться погашение данного кредита
     */
    private PaymentAccount paymentAccountCredit;

    public CreditAccount() {
    }

    public CreditAccount(int creditAccountId, User userCreditAccount,
                         String nameBankOffice, LocalDate dateBeginCredit, LocalDate dateEndCredit,
                         int kolMonthCredit, int sumCredit, int monthPaymentCredit,
                         int rateCredit, Employee employeeCreditAccount, PaymentAccount paymentAccountCredit){
                this.creditAccountId=creditAccountId;
                this.userCreditAccount=userCreditAccount;
                this.nameBankOffice=nameBankOffice;
                this.dateBeginCredit=dateBeginCredit;
                this.dateEndCredit=dateEndCredit;
                this.kolMonthCredit=kolMonthCredit;
                this.sumCredit=sumCredit;
                this.monthPaymentCredit=monthPaymentCredit;
                this.rateCredit=rateCredit;
                this.employeeCreditAccount=employeeCreditAccount;
                this.paymentAccountCredit=paymentAccountCredit;
    }


    @Override
    public String toString() {
        return "\n\nПользователь, за которым закреплен кредитный счет "+ this.userCreditAccount.getFioUser()+
                "\nНазвание банка, где взят кредит "+ this.nameBankOffice+
                "\nДата начала кредита "+this.dateBeginCredit+
                "\nДата окончания кредита "+this.dateEndCredit+
                "\nКол-во месяцев, на которые взят кредит "+this.kolMonthCredit+
                "\nСумма кредита "+this.sumCredit+
                "\nЕжемесячный платеж "+this.monthPaymentCredit+
                "\nПроцентная ставка "+this.rateCredit+
                "\nСотрудник, который выдал кредит "+this.employeeCreditAccount.getFioEmployee()+
                "\nПлатежный счет в банке с которого будет осуществляться погашение данного кредита "+this.paymentAccountCredit.getPaymentAccountId();
    }
}
