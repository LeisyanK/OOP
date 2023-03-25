package org.example.seminar5.cw;

import org.example.seminar5.cw.model.BankUsers;
import org.example.seminar5.cw.model.Company;
import org.example.seminar5.cw.model.Human;
import org.example.seminar5.cw.model.User;
import org.example.seminar5.cw.view.UserView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Классы различных пользователей 2-3
// Класс в сервисе, рассматривающий заявки на кредитование

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите имя:");
//        String name = scanner.nextLine();
//        System.out.println("Введите возраст:");
//        int age = scanner.nextInt();
//        System.out.println("Введите зарплату:");
//        float salary = scanner.nextFloat();
        UserView userView = new UserView();
//        userView.saveUser(name, age, salary);
//        Human human1 = new Human("name1");
        BankUsers users = new BankUsers();
        users.initUser(List.of(
                new Human("Human1", false, 100, 30, 50000),
                new Human("Human2", true, 100, 36, 40000),
                new Human("Human3", false, 150, 25, 10000),
                new Company("Company", false, 100000, 141),
                new Company("Company", true, 40000, 545)
        ));
        userView.creditPrint(users.getUser("Human1"), 100);
        System.out.println(users.getUser("Human1").isHaveCredit());
    }
}
