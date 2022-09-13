package tech.reliab.course.taranovaja.bank.service.impl;

import tech.reliab.course.taranovaja.bank.entity.PaymentAccount;
import tech.reliab.course.taranovaja.bank.entity.User;
import tech.reliab.course.taranovaja.bank.service.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService {
    private PaymentAccount paymentAccount;

    @Override
    public PaymentAccount createPaymentAccount(int paymentAccountId, User userPaymentAccount,
                                               String paymentAccountBankName) {
        this.paymentAccount=new PaymentAccount(paymentAccountId, userPaymentAccount, paymentAccountBankName);
        return paymentAccount;
    }

    @Override
    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    @Override
    public void add(PaymentAccount paymentAccount) {
        this.paymentAccount=paymentAccount;
    }

    @Override
    public void update(PaymentAccount paymentAccount) {
        this.paymentAccount.setPaymentAccountId(paymentAccount.getPaymentAccountId());
        this.paymentAccount.setUserPaymentAccount(paymentAccount.getUserPaymentAccount());
        this.paymentAccount.setPaymentAccountBankName(paymentAccount.getPaymentAccountBankName());
        this.paymentAccount.setSumPaymentAccount(paymentAccount.getSumPaymentAccount());
    }

    @Override
    public void delete() {
        this.paymentAccount=null;
    }
}
