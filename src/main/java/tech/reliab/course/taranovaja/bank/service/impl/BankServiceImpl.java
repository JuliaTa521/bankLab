package tech.reliab.course.taranovaja.bank.service.impl;

import tech.reliab.course.taranovaja.bank.entity.Bank;
import tech.reliab.course.taranovaja.bank.service.BankService;

public class BankServiceImpl implements BankService {
    private Bank bank;

    @Override
    public Bank createBank(int bankId, String nameBank) {
        this.bank=new Bank(bankId, nameBank);
        return this.bank;
    }

    @Override
    public Bank getBank() {

        return bank;
    }

    @Override
    public Bank add(Bank bank) {
        this.bank=bank;
        return this.bank;
    }

    @Override
    public void update(Bank bank) {
        this.bank.setBankId(bank.getBankId());
        this.bank.setNameBank(bank.getNameBank());
        this.bank.setKolOffices(bank.getKolOffices());
        this.bank.setKolBankAtm(bank.getKolBankAtm());
        this.bank.setKolEmployee(bank.getKolEmployee());
        this.bank.setKolUser(bank.getKolUser());
        this.bank.setRating(bank.getRating());
        this.bank.setAllMoney(bank.getAllMoney());
        this.bank.setRate(bank.getRate());
    }

    @Override
    public void delete(String nameBank) {
        this.bank=null;
    }


    }
