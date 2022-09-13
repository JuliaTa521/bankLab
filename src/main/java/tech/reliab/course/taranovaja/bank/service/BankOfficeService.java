package tech.reliab.course.taranovaja.bank.service;


import tech.reliab.course.taranovaja.bank.entity.BankOffice;

public interface BankOfficeService {
    BankOffice createBankOffice(int bankOfficeId, String nameBankOffice, String addressBankOffice,
                                String statusBankOffice, boolean placementBankAtm, int kolvBankAtmOffice,
                                boolean creditRegistration, boolean issuingMoneyOffice,
                                boolean depositMoneyAtm, int kolvMoneyBankOffice, int costBankOffice);

    BankOffice getBankOffice();

    void add(BankOffice bankOffice);

    void update(BankOffice bankOffice);

    void delete();
}
