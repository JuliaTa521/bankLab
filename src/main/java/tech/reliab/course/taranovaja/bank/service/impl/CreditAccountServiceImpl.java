package tech.reliab.course.taranovaja.bank.service.impl;

import tech.reliab.course.taranovaja.bank.entity.CreditAccount;
import tech.reliab.course.taranovaja.bank.entity.Employee;
import tech.reliab.course.taranovaja.bank.entity.PaymentAccount;
import tech.reliab.course.taranovaja.bank.entity.User;
import tech.reliab.course.taranovaja.bank.service.CreditAccountService;

import java.time.LocalDate;
import java.util.Date;

public class CreditAccountServiceImpl implements CreditAccountService {
    private CreditAccount creditAccount;

    @Override
    public CreditAccount createCreditAccount(int creditAccountId, User userCreditAccount,
                                             String nameBankOffice, LocalDate dateBeginCredit,
                                             LocalDate dateEndCredit, int kolMonthCredit,
                                             int sumCredit, int monthPaymentCredit,
                                             int rateCredit, Employee employeeCreditAccount,
                                             PaymentAccount paymentAccountCredit) {
        this.creditAccount = new CreditAccount(creditAccountId, userCreditAccount,
                nameBankOffice, dateBeginCredit,
                dateEndCredit, kolMonthCredit,
                sumCredit,monthPaymentCredit,
                rateCredit,  employeeCreditAccount, paymentAccountCredit);
        return this.creditAccount;
    }

    @Override
    public CreditAccount getCreditAccount() {
        return creditAccount;
    }

    @Override
    public void add(CreditAccount creditAccount) {
        this.creditAccount=creditAccount;
    }

    @Override
    public void update(CreditAccount creditAccount) {
        this.creditAccount.setCreditAccountId(creditAccount.getCreditAccountId());
        this.creditAccount.setUserCreditAccount(creditAccount.getUserCreditAccount());
        this.creditAccount.setNameBankOffice(creditAccount.getNameBankOffice());
        this.creditAccount.setDateBeginCredit(creditAccount.getDateBeginCredit());
        this.creditAccount.setDateEndCredit(creditAccount.getDateEndCredit());
        this.creditAccount.setKolMonthCredit(creditAccount.getKolMonthCredit());
        this.creditAccount.setSumCredit(creditAccount.getSumCredit());
        this.creditAccount.setMonthPaymentCredit(creditAccount.getMonthPaymentCredit());
        this.creditAccount.setRateCredit(creditAccount.getRateCredit());
        this.creditAccount.setEmployeeCreditAccount(creditAccount.getEmployeeCreditAccount());
        this.creditAccount.setPaymentAccountCredit(creditAccount.getPaymentAccountCredit());

    }

    @Override
    public void delete() {
        this.creditAccount=null;
    }
}
