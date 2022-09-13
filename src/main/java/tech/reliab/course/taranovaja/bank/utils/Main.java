package tech.reliab.course.taranovaja.bank.utils;

import tech.reliab.course.taranovaja.bank.entity.*;
import tech.reliab.course.taranovaja.bank.service.PaymentAccountService;
import tech.reliab.course.taranovaja.bank.service.impl.*;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /***Создание банка*/
        BankServiceImpl banks=new BankServiceImpl();
        Bank bank=banks.createBank(1, "HomeCredit");

        /*** Создание офиса*/
        BankOfficeServiceImpl office=new BankOfficeServiceImpl();
        BankOffice offices=office.createBankOffice(1, "Офис","ул. Садовая",
                "Работает",true, 0, true, true,
                true, bank.getAllMoney(), 50000);
        bank.setKolOffices(bank.getKolOffices()+1);

        /***Создание сотрудника банка*/
        EmployeeServiceImpl employee=new EmployeeServiceImpl();
        Employee empWork=employee.createEmployee(1,"Иванов Иван Иванович",
                LocalDate.of(2002, 9, 10),  "Офис менеджер",bank,
                true, offices,true,50000);
        bank.setKolEmployee(bank.getKolEmployee()+1);

        /***Создание банкомата*/
        AtmServiceImpl atm=new AtmServiceImpl();
        BankAtm atms=atm.createBankAtm(1,"Первый", "ул.Щорса",
                "Нет денег", bank, offices, empWork, true,
                true, 0, 35000);
        bank.setKolBankAtm(bank.getKolBankAtm()+1);


        /***Создание пользователя*/
        UserServiceImpl user=new UserServiceImpl();
        User users=user.createUser(1, "Петров Петр Петрович", LocalDate.of(2001, 5, 15),
                "НИУ БелГУ", bank);
        bank.setKolUser(bank.getKolUser()+1);

        /**Создание платежного счета*/
        PaymentAccountServiceImpl paymentAccount = new PaymentAccountServiceImpl();
        PaymentAccount paymentAcc = paymentAccount.createPaymentAccount(1, users, "HomeCredit");
        paymentAcc.setSumPaymentAccount(users.getUserMonthlyIncome());

        /** Создание кредитного счета */
        CreditAccountServiceImpl creditAccountService = new CreditAccountServiceImpl();
        CreditAccount creditAccount =creditAccountService.createCreditAccount (1, users,
                bank.getNameBank(), LocalDate.of(2022, 9, 11),
                LocalDate.of(2032, 9, 11),
                120, 10000000, 100000,
                bank.getRating(), empWork, paymentAcc);
        users.setUserCreditAccount(creditAccount);

        System.out.println(bank);
        System.out.println(offices);
        System.out.println(atms);
        System.out.println(empWork);
        System.out.println(users);
        System.out.println(creditAccount);
        System.out.println(paymentAcc);
    }

}
