package tech.reliab.course.taranovaja.bank.service.impl;

import tech.reliab.course.taranovaja.bank.entity.Bank;
import tech.reliab.course.taranovaja.bank.entity.BankAtm;
import tech.reliab.course.taranovaja.bank.entity.BankOffice;
import tech.reliab.course.taranovaja.bank.entity.Employee;
import tech.reliab.course.taranovaja.bank.service.AtmService;

public class AtmServiceImpl implements AtmService {
    private BankAtm bankAtm;

    @Override
    public BankAtm createBankAtm(int bankAtmId, String nameBankAtm, String addressBankAtm,
                                 String statusBankAtm, Bank bankBankAtm, BankOffice locationBankAtm,
                                 Employee employeeBankAtm, boolean issuingMoneyAtm,
                                 boolean depositMoneyAtm, int kolMoneyAtm, int costBankAtm) {
       this.bankAtm=new BankAtm( bankAtmId, nameBankAtm,
               addressBankAtm, statusBankAtm, bankBankAtm,
               locationBankAtm, employeeBankAtm, issuingMoneyAtm,
               depositMoneyAtm, kolMoneyAtm, costBankAtm);
        return this.bankAtm;
    }

    @Override
    public BankAtm getBankAtm() {
        return bankAtm;
    }

    @Override
    public void add(BankAtm bankAtm) {
        this.bankAtm=bankAtm;
    }

    @Override
    public void update(BankAtm bankAtm) {
        this.bankAtm.setBankAtmId(bankAtm.getBankAtmId());
        this.bankAtm.setNameBankAtm(bankAtm.getNameBankAtm());
        this.bankAtm.setAddressBankAtm(bankAtm.getAddressBankAtm());
        this.bankAtm.setStatusBankAtm(bankAtm.getStatusBankAtm());
        this.bankAtm.setBankBankAtm(bankAtm.getBankBankAtm());
        this.bankAtm.setLocationBankAtm(bankAtm.getLocationBankAtm());
        this.bankAtm.setEmployeeBankAtm(bankAtm.getEmployeeBankAtm());
        this.bankAtm.setIssuingMoneyAtm(bankAtm.isIssuingMoneyAtm());
        this.bankAtm.setDepositMoneyAtm(bankAtm.isDepositMoneyAtm());
        this.bankAtm.setKolMoneyAtm(bankAtm.getKolMoneyAtm());
        this.bankAtm.setCostBankAtm(bankAtm.getCostBankAtm());
    }

    @Override
    public void delete() {
        this.bankAtm=null;
    }
}
