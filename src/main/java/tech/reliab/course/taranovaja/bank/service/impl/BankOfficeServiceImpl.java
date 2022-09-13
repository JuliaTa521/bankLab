package tech.reliab.course.taranovaja.bank.service.impl;

import tech.reliab.course.taranovaja.bank.entity.BankAtm;
import tech.reliab.course.taranovaja.bank.entity.BankOffice;
import tech.reliab.course.taranovaja.bank.service.BankOfficeService;

public class BankOfficeServiceImpl implements BankOfficeService {
    private BankOffice bankOffice;

    @Override
    public BankOffice createBankOffice(int bankOfficeId, String nameBankOffice,
                                       String addressBankOffice, String statusBankOffice,
                                       boolean placementBankAtm, int kolBankAtmOffice,
                                       boolean creditRegistration, boolean issuingMoneyOffice,
                                       boolean depositMoneyAtm, int kolMoneyBankOffice, int costBankOffice) {
        this.bankOffice=new BankOffice( bankOfficeId, nameBankOffice,
                addressBankOffice, statusBankOffice, placementBankAtm,
                kolBankAtmOffice, creditRegistration, issuingMoneyOffice,
                depositMoneyAtm, kolMoneyBankOffice, costBankOffice);
        return this.bankOffice;
    }

    @Override
    public BankOffice getBankOffice() {
        return bankOffice;
    }

    @Override
    public void add(BankOffice bankOffice) {
        this.bankOffice=bankOffice;
    }

    @Override
    public void update(BankOffice bankOffice) {
        this.bankOffice.setBankOfficeId(bankOffice.getBankOfficeId());
        this.bankOffice.setNameBankOffice(bankOffice.getNameBankOffice());
        this.bankOffice.setAddressBankOffice(bankOffice.getAddressBankOffice());
        this.bankOffice.setStatusBankOffice(bankOffice.getStatusBankOffice());
        this.bankOffice.setPlacementBankAtm(bankOffice.isPlacementBankAtm());
        this.bankOffice.setKolBankAtmOffice(bankOffice.getKolBankAtmOffice());
        this.bankOffice.setCreditRegistration(bankOffice.isCreditRegistration());
        this.bankOffice.setIssuingMoneyOffice(bankOffice.isIssuingMoneyOffice());
        this.bankOffice.setDepositMoneyAtm(bankOffice.isDepositMoneyAtm());
        this.bankOffice.setKolMoneyBankOffice(bankOffice.getKolMoneyBankOffice());
        this.bankOffice.setCostBankOffice(bankOffice.getCostBankOffice());
    }

    @Override
    public void delete() {
        this.bankOffice=null;
    }
}
