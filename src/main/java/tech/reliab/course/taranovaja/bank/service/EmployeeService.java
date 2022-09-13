package tech.reliab.course.taranovaja.bank.service;


import tech.reliab.course.taranovaja.bank.entity.Bank;
import tech.reliab.course.taranovaja.bank.entity.BankOffice;
import tech.reliab.course.taranovaja.bank.entity.Employee;

import java.time.LocalDate;
import java.util.Date;

public interface EmployeeService {
    Employee createEmployee(int employeId, String fioEmployee, LocalDate dateBirthEmployee,
                            String positionJob, Bank bankEmployee, boolean optionWork, BankOffice officeEmployee,
                            boolean creditEmp, int salaryEmployee);

    Employee getEmployee();

    void add(Employee employee);

    void update(Employee employee);

    void delete();
}
