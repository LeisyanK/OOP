package org.example.seminar5.cw.service;

import org.example.seminar5.cw.model.Company;
import org.example.seminar5.cw.model.Human;
import org.example.seminar5.cw.model.User;

import java.io.FileWriter;

public class UserServiceImpl implements UserService{

    @Override
    public void save(User user) {
//        Company com = new User();
//        Human hum = new User();
        try(FileWriter fileWriter = new FileWriter("users.txt")){
            fileWriter.write(user.toString());
        }catch (Exception e){
            System.out.println("ошибка при попытке сохранения пользователя");
            e.printStackTrace();
        }
    }


    @Override
    public boolean credit(User user, int creditSum) {
        if (user.isHaveCredit() || (user.getBalance() > creditSum || 2*user.getBalance() < creditSum)) return false;
        else {user.setHaveCredit(true);
            System.out.println("new user = " + user);
            return true; }
    }
}
