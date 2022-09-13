package tech.reliab.course.taranovaja.bank.service.impl;

import tech.reliab.course.taranovaja.bank.entity.Bank;
import tech.reliab.course.taranovaja.bank.entity.BankOffice;
import tech.reliab.course.taranovaja.bank.entity.Employee;
import tech.reliab.course.taranovaja.bank.service.EmployeeService;

import java.time.LocalDate;
import java.util.Date;

public class EmployeeServiceImpl implements EmployeeService {
    private Employee employee;

    @Override
    public Employee createEmployee(int employeeId, String fioEmployee, LocalDate dateBirthEmployee,
                                   String positionJob,Bank bankEmployee, boolean optionWork, BankOffice officeEmployee,
                                   boolean creditEmp, int salaryEmployee) {
        this.employee = new Employee(employeeId, fioEmployee, dateBirthEmployee,
                 positionJob, bankEmployee, optionWork, officeEmployee, creditEmp, salaryEmployee);
        return employee;
    }

    @Override
    public Employee getEmployee() {
        return employee;
    }

    @Override
    public void add(Employee employee) {
        this.employee=employee;
    }

    @Override
    public void update(Employee employee) {
        this.employee.setEmployeeId(employee.getEmployeeId());
        this.employee.setFioEmployee(employee.getFioEmployee());
        this.employee.setDateBirthEmployee(employee.getDateBirthEmployee());
        this.employee.setPositionJob(employee.getPositionJob());
        this.employee.setOptionWork(employee.isOptionWork());
        this.employee.setOfficeEmployee(employee.getOfficeEmployee());
        this.employee.setCreditEmp(employee.isCreditEmp());
        this.employee.setSalaryEmployee(employee.getSalaryEmployee());
    }

    @Override
    public void delete() {
        this.employee=null;
    }
}
