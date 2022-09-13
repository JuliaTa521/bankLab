package tech.reliab.course.taranovaja.bank.service.impl;

import tech.reliab.course.taranovaja.bank.entity.Bank;
import tech.reliab.course.taranovaja.bank.entity.User;
import tech.reliab.course.taranovaja.bank.service.UserService;
import tech.reliab.course.taranovaja.bank.utils.RandomGenerator;

import java.time.LocalDate;


public class UserServiceImpl implements UserService {
    private User user;

    @Override
    public User createUser(int userId, String fioUser, LocalDate userBirthDate,
                           String placeWorkUser, Bank userBank) {
        this.user=new User(userId, fioUser, userBirthDate, placeWorkUser, userBank);
        return user;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void add(User user) {
        this.user=user;
    }

    @Override
    public void update(User user) {
        this.user.setUserId(user.getUserId());
        this.user.setFioUser(user.getFioUser());
        this.user.setUserBirthDate(user.getUserBirthDate());
        this.user.setPlaceWorkUser(user.getPlaceWorkUser());
        this.user.setUserMonthlyIncome(user.getUserMonthlyIncome());
        this.user.setUserBank(user.getUserBank());
        this.user.setUserCreditAccount(user.getUserCreditAccount());
        this.user.setUserPaymentAccount(user.getUserPaymentAccount());
        this.user.setBankCreditRating(user.getBankCreditRating());
    }

    @Override
    public void delete() {
        this.user=null;
    }

    @Override
    public void showUsers() {

    }
}
