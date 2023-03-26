package org.example.seminar5.cw.view;

import org.example.seminar5.cw.model.User;
import org.example.seminar5.cw.service.UserService;
import org.example.seminar5.cw.service.UserServiceImpl;

public class UserView {
    private UserService userService = new UserServiceImpl();
    public void saveUser(String name, int age, float salary){
        userService.save(new User(name));
    }
//    public void creditPrint(User user, int creditSum){
//        System.out.println(userService.credit(user, creditSum));
//    }
    public boolean creditPrint(User user, int creditSum){
//        System.out.println(userService.credit(user, creditSum));
        System.out.println("Получили клиента:"+user+". Сумма кредита: "+creditSum);
        return userService.credit(user, creditSum);
    }
}
