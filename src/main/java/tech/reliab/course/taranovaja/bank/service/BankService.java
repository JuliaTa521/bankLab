package tech.reliab.course.taranovaja.bank.service;

import tech.reliab.course.taranovaja.bank.entity.Bank;

public interface BankService {
    Bank createBank(int bankId, String nameBank);

    Bank getBank();

    Bank add(Bank bank);

    void update(Bank bank);

    void delete(String nameBank);
}
