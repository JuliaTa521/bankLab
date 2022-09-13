package tech.reliab.course.taranovaja.bank.service;

import tech.reliab.course.taranovaja.bank.entity.PaymentAccount;
import tech.reliab.course.taranovaja.bank.entity.User;


public interface PaymentAccountService {
    PaymentAccount createPaymentAccount(int paymentAccountId, User userPaymentAccount, String paymentAccountBankName);

    PaymentAccount getPaymentAccount();

    void add(PaymentAccount paymentAccount);

    void update(PaymentAccount paymentAccount);

    void delete();
}
