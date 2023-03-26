package org.example.seminar5.cw.model;

import org.example.seminar5.cw.view.UserView;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankUsers {
    private List<User> userList = new ArrayList<>();
    public void initUser(User user){
        this.userList.add(user);
    }
//    public void initUser(List<User> userList){
//        this.userList = userList;
//    }
    public User getUser(String name){
        for (User user: userList) {
            if(user.getName().equalsIgnoreCase(name)) return user;
        }
        return new User("Такого пользователя нет");
    }
    public void printUsers(){
        for (User user : this.userList) {
            System.out.println(user);
        }
    }

    public void giveCredit(){
        UserView userView = new UserView();
        for (User user : this.userList) {
            System.out.println("Решение о кредите "+userView.creditPrint(user, new Random().nextInt(10000)));
//            user.setHaveCredit(userView.creditPrint(user, new Random().nextInt(10000)));
//            System.out.println(user);
            System.out.println();
//            System.out.println(user);
        }
    }
}
