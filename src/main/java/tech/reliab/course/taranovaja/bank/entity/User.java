package tech.reliab.course.taranovaja.bank.entity;

import lombok.Getter;
import lombok.Setter;
import tech.reliab.course.taranovaja.bank.utils.RandomGenerator;

import java.time.LocalDate;

@Setter
@Getter

public class User {
    /**
     * Id клиента
     */
    private int userId;

    /**
     * ФИО
     */
    private String fioUser;

    /**
     * Дата рождения
     */
    private LocalDate userBirthDate;

    /**
     * Место работы
     */
    private String placeWorkUser;

    /**
     * Ежемесячный доход (генерируется рандомно, но не более 10 000)
     */
    private int userMonthlyIncome;

    /**
     * Банки, которыми он пользуется
     */
    private Bank userBank;

    /**
     * Кредитные счета (по умолчанию пусто)
     */
    private CreditAccount userCreditAccount;

    /**
     * Платежные счета (по умолчанию пусто)
     */
    private String userPaymentAccount;

    /**
     * Кредитный рейтинг для банка (генерируется рандомно исходя из ежемесячного дохода,
     * от меньше 1 000 – 100, от 1 000 до 2 000 – 200 и т.д. вплоть до 10 000)
     */
    private int bankCreditRating;

    public User() {
    }

    public User(int userId, String fioUser, LocalDate userBirthDate, String placeWorkUser, Bank userBank){
        this.userId=userId;
        this.fioUser=fioUser;
        this.userBirthDate=userBirthDate;
        this.placeWorkUser=placeWorkUser;
        this.userMonthlyIncome= RandomGenerator.generateInt(1,10000);
        this.userBank=userBank;
        this.userCreditAccount=null;
        this.userPaymentAccount=null;
        this.bankCreditRating=RandomGenerator.generateCreditRating(this.userMonthlyIncome);
    }

    @Override
    public String toString() {
        return "\n\nКлиент " + this.fioUser + ". \nДата рождения " + this.userBirthDate +
                ". \nРаботает в " + this.placeWorkUser + " и имеет доход " + this.userMonthlyIncome +
                " рублей.\n" + "У клиента заведены счета в банке(ах): " + this.userBank.getNameBank() +
                "\nНомер кредитного счета: " + this.userCreditAccount.getCreditAccountId() +
        //"\nНомер платежного счета: " + this.userPaymentAccount.getPaymentAccountId() +
                "\nКредитный рейтинг клиента составляет " + this.bankCreditRating + "\n";
    }


}
