package tech.reliab.course.taranovaja.bank.service;


import tech.reliab.course.taranovaja.bank.entity.Bank;
import tech.reliab.course.taranovaja.bank.entity.BankAtm;
import tech.reliab.course.taranovaja.bank.entity.BankOffice;
import tech.reliab.course.taranovaja.bank.entity.Employee;

public interface AtmService {

    BankAtm createBankAtm(int bankAtmId, String nameBankAtm, String addressBankAtm,
                          String statusBankAtm, Bank bankBankAtm, BankOffice locationBankAtm,
                          Employee employeeBankAtm, boolean issuingMoneyAtm, boolean depositMoneyAtm,
                          int kolMoneyAtm, int costBankAtm);

    BankAtm getBankAtm();

    void add(BankAtm bankAtm);

    void update(BankAtm bankAtm);

    void delete();

}
