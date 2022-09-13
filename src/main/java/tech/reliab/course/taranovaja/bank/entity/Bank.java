package tech.reliab.course.taranovaja.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import tech.reliab.course.taranovaja.bank.utils.RandomGenerator;

@Setter// создание сеттеров
@Getter// создание геттеров


public class Bank {

    /**
     *Id банка
     */
    private int bankId;

    /**
     *Имя банка
     */
    private String nameBank;

    /**
     *Кол-во офисов
     */
    private int kolOffices;

    /**
     *Кол-во банкоматов
     */
    private int kolBankAtm;

    /**
     *Кол-во сотрудников
     */
    private int kolEmployee;

    /**
     *Кол-во клиентов
     */
    private int kolUser;

    /**
     *Рейтинг банка
     */
    private int rating;

    /**
     *Всего денег в банке
     */
    private int allMoney;

    /**
     *Процентная ставка
     */
    private float rate;

    public Bank(int bankId) {
    }

    public Bank(int bankId, String nameBank) {
        this.bankId = bankId;
        this.nameBank = nameBank;
        this.kolOffices = 0;
        this.kolBankAtm = 0;
        this.kolEmployee = 0;
        this.kolUser = 0;
        this.rating = RandomGenerator.generateInt(1,100);
        this.allMoney = RandomGenerator.generateInt(1,1000000);
        this.rate = RandomGenerator.generateRateUseRating(1, 20, this.rating);
    }

    @Override
    public String toString() {
        return  "\nБанк " + this.nameBank + " содержит:\n" +
                this.kolOffices + " офис(ов), " + this.kolBankAtm + " банкомат(ов) " +
                this.kolEmployee + " сотрудника(ов). \nОбслуживает " + this.kolUser + " клиента(ов).\n" +
                "Рейтинг банка: " + this.rating + " при ставке в " + this.rate + "%.\n" +
                "Суммарно на счетах и в банкоматах " + this.allMoney + " рублей\n";

    }
}
