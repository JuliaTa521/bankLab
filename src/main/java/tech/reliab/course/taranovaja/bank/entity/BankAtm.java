package tech.reliab.course.taranovaja.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter// создание сеттеров
@Getter// создание геттеров

public class BankAtm {

    /**
     *Id банкомата
     */
    private int bankAtmId;

    /**
     *Имя банкомата
     */
    private String nameBankAtm;

    /**
     *Адрес (сопадает с адресом банковского офиса)
     */
    private String addressBankAtm;

    /**
     *Статус (работает/не работает/нет денег)
     */
    private String statusBankAtm;

    /**
     *Банк, которому принадлежит банкомат
     */
    private Bank bankBankAtm;

    /**
     *Расположение банкомата (банкомат может быть расположен только в банковском офисе)
     */
    private BankOffice locationBankAtm;

    /**
     *Обслуживающий сотрудник
     */
    private Employee employeeBankAtm;

    /**
     *Работает ли на выдачу денег? (да/нет)
     */
    private boolean issuingMoneyAtm;

    /**
     *Можно ли внести деньги? (да/нет)
     */
    private boolean depositMoneyAtm;

    /**
     *Кол-во денег в банкомате (напрямую зависит от поля «Всего денег в банке)
     */
    private float kolMoneyAtm;

    /**
     *Стоимость обслуживания банкомата
     */
    private int costBankAtm;

    public BankAtm() {
    }

    public BankAtm(int bankAtmId, String nameBankAtm,
                   String addressBankAtm, String statusBankAtm,
                   Bank bankBankAtm, BankOffice locationBankAtm,
                   Employee employeeBankAtm, boolean issuingMoneyAtm,
                   boolean depositMoneyAtm, int kolMoneyAtm, int costBankAtm){
                this.bankAtmId=bankAtmId;
                this.nameBankAtm=nameBankAtm;
                this.addressBankAtm=addressBankAtm;
                this.statusBankAtm=statusBankAtm;
                this.bankBankAtm=bankBankAtm;
                this.locationBankAtm=locationBankAtm;
                this.employeeBankAtm=employeeBankAtm;
                this.issuingMoneyAtm=issuingMoneyAtm;
                this.depositMoneyAtm=depositMoneyAtm;
                this.kolMoneyAtm=kolMoneyAtm;
                this.costBankAtm=costBankAtm;
    }

    @Override
    public String toString() {
        return "\n\nНазвание банкомата: " + this.nameBankAtm +
                "\nАдрес: " + this.addressBankAtm +
                "\nСтатус (работает/не работает/нет денег): " + this.statusBankAtm +
               "\nБанк, которому принадлежит банкомат: " + this.bankBankAtm.getNameBank() +
                "\nРасположение банкомата: " + this.locationBankAtm.getAddressBankOffice() +
                "\nОбслуживающий сотрудник: " + this.employeeBankAtm.getFioEmployee() +
                "\nРаботает на выдачу денег? : " + this.issuingMoneyAtm +
                "\nМожно внести деньги? : " + this.depositMoneyAtm +
                "\nКол-во денег в банковском офисе: " + this.kolMoneyAtm +
                "\nСтоимость обслуживания банкомата: " + this.costBankAtm;
    }
}
