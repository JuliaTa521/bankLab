package tech.reliab.course.taranovaja.bank.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class Employee {
    /**
     * Id сотрудника
     */
    private int employeeId;

    /**
     * ФИО
     */
    private String fioEmployee;

    /**
     * Дата рождения
     */
    private LocalDate dateBirthEmployee;

    /**
     * Должность
     */
    private String positionJob;

    /**
     * В каком банке работает
     */
    private Bank bankEmployee;

    /**
     * Работает ли в банковском офисе или удаленно? (да/нет)
     */
    private boolean optionWork;

    /**
     * Банковский офис, в котором работает
     */
    private BankOffice officeEmployee;

    /**
     * Может ли выдавать кредиты? (да/нет)
     */
    private boolean creditEmp;

    /**
     * Размер зарплаты
     */
    private int salaryEmployee;

    public Employee() {
    }

    public Employee(int employeeId, String fioEmployee, LocalDate dateBirthEmployee,
                    String positionJob, Bank bankEmployee, boolean optionWork, BankOffice officeEmployee,
                    boolean creditEmp, int salaryEmployee){
        this.employeeId=employeeId;
        this.fioEmployee=fioEmployee;
        this.dateBirthEmployee=dateBirthEmployee;
        this.positionJob=positionJob;
        this.bankEmployee=bankEmployee;
        this.optionWork=optionWork;
        this.officeEmployee=officeEmployee;
        this.creditEmp=creditEmp;
        this.salaryEmployee=salaryEmployee;
    }

    @Override
    public String toString() {
        return "\n\nСотрудник ФИО "+ this.fioEmployee+
                "\nДата рождения "+this.dateBirthEmployee+
                "\nДолжность "+this.positionJob+
                "\nРаботает в банке "+ this.bankEmployee.getNameBank()+
                " "+this.optionWork+
                "\nБанковский офис, в котором работает "+this.officeEmployee.getNameBankOffice()+
                "\nМожет ли выдавать кредиты? "+this.creditEmp+
                "\nРазмер зарплаты "+this.salaryEmployee;
    }
}
