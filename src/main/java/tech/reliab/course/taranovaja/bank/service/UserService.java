package tech.reliab.course.taranovaja.bank.service;

import tech.reliab.course.taranovaja.bank.entity.Bank;
import tech.reliab.course.taranovaja.bank.entity.User;

import java.time.LocalDate;
import java.util.Date;

public interface UserService {

    User createUser(int userId, String fioUser, LocalDate userBirthDate, String placeWorkUser, Bank userBank);

    User getUser();

    void add(User user);

    void update(User user);

    void delete();

    void showUsers();

}
