package tech.reliab.course.taranovaja.bank.service;


import tech.reliab.course.taranovaja.bank.entity.CreditAccount;
import tech.reliab.course.taranovaja.bank.entity.Employee;
import tech.reliab.course.taranovaja.bank.entity.PaymentAccount;
import tech.reliab.course.taranovaja.bank.entity.User;

import java.time.LocalDate;
import java.util.Date;

public interface CreditAccountService {
    CreditAccount createCreditAccount(int creditAccountId, User userCreditAccount,
                                      String nameBankOffice, LocalDate dateBeginCredit,
                                      LocalDate dateEndCredit, int kolvMonthCredit,
                                      int sumCredit, int monthPaymentCredit,
                                      int rateCredit, Employee employeeCreditAccount,
                                      PaymentAccount paymentAccountCredit);

    CreditAccount getCreditAccount();

    void add(CreditAccount creditAccount);

    void update(CreditAccount creditAccount);

    void delete();
}
