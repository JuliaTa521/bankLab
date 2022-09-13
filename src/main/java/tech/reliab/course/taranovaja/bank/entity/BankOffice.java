package tech.reliab.course.taranovaja.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter// создание сеттеров
@Getter// создание геттеров


public class BankOffice {

    /**
     * Id банковского офиса
     */
    private int bankOfficeId;

    /**
     * Название офиса
     */
    private String nameBankOffice;

    /**
     * Адрес банковского офиса
     */
    private String addressBankOffice;

    /**
     * Статус (работает/не работает)
     */
    private String statusBankOffice;

    /**
     * Можно ли разместить банкомат? (да/нет)
     */
    private boolean placementBankAtm;

    /**
     * Кол-во банкоматов в данном офисе (напрямую зависит от общего числа банкоматов у банка)
     */
    private int kolBankAtmOffice;

    /**
     * Можно ли оформить кредит в данном офисе? (да/нет)
     */
    private boolean creditRegistration;

    /**
     * Работает ли на выдачу денег? (да/нет)
     */
    private boolean issuingMoneyOffice;

    /**
     * Можно ли внести деньги? (да/нет)
     */
    private boolean depositMoneyAtm;

    /**
     * Кол-во денег в банковском офисе (напрямую зависит от поля «Всего денег в банке)
     */
    private int kolMoneyBankOffice;

    /**
     * Стоимость аренды банковского офиса
     */
    private int costBankOffice;

    public BankOffice() {
    }

    public BankOffice(int bankOfficeId, String nameBankOffice,
                      String addressBankOffice, String statusBankOffice,
                      boolean placementBankAtm, int kolBankAtmOffice,
                      boolean creditRegistration, boolean issuingMoneyOffice,
                      boolean depositMoneyAtm, int kovMoneyBankOffice, int costBankOffice) {
        this.bankOfficeId = bankOfficeId;
        this.nameBankOffice = nameBankOffice;
        this.addressBankOffice = addressBankOffice;
        this.statusBankOffice = statusBankOffice;
        this.placementBankAtm = placementBankAtm;
        this.kolBankAtmOffice = kolBankAtmOffice;
        this.creditRegistration = creditRegistration;
        this.issuingMoneyOffice = issuingMoneyOffice;
        this.depositMoneyAtm = depositMoneyAtm;
        this.kolMoneyBankOffice = kolMoneyBankOffice;
        this.costBankOffice = costBankOffice;
    }

    @Override
    public String toString() {
        return "\n\nНазвание офиса "  + this.nameBankOffice +
                "\nАдрес банковского офиса " + this.addressBankOffice +
                "\nСтатус " + this.statusBankOffice +
                "\nМожно ли разместить банкомат? " + this.placementBankAtm +
                "\nКол-во банкоматов в данном офисе " + this.kolBankAtmOffice +
                "\nМожно ли оформить кредит в данном офисе? " + this.creditRegistration +
                "\nРаботает ли на выдачу денег? " + this.issuingMoneyOffice +
                "\nМожно ли внести деньги? " + this.depositMoneyAtm +
                "\nКол-во денег в банковском офисе " + this.kolMoneyBankOffice +
                "\nСтоимость аренды банковского офиса " + this.costBankOffice;
    }
}
