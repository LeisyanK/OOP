package org.example.seminar5.cw;

import org.example.seminar5.cw.model.BankUsers;
import org.example.seminar5.cw.model.Company;
import org.example.seminar5.cw.model.Human;
import org.example.seminar5.cw.model.User;
import org.example.seminar5.cw.view.UserView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
//Классы различных пользователей 2-3
// Класс в сервисе, рассматривающий заявки на кредитование

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество клиентов банка:");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(reader.readLine());
        int num = scanner.nextInt();
//        System.out.println("Введите имя:");
//        String name = scanner.nextLine();
//        System.out.println("Введите возраст:");
//        int age = scanner.nextInt();
//        System.out.println("Введите зарплату:");
//        float salary = scanner.nextFloat();
        UserView userView = new UserView();
        BankUsers users = new BankUsers();
        Random r = new Random();
        for (int i = 0; i < num; i++) {
//            System.out.println(i);
            boolean cred = r.nextInt(2) == 1;
//            System.out.println(cred);
//            выше укороченная запись
//            boolean cred = false;
//            if (scanner.nextByte(2) == 1) { cred = true;}
            if (r.nextInt(2) == 1) { // клиент - человек (Физ.лицо)
//                System.out.println("Human");
                users.initUser((new Human("Human" + i, cred, r.nextInt(10000),
                        r.nextInt(70), r.nextInt(100000))));
            } else {
//                System.out.println("Company");
                users.initUser((new Company("Company" + i, cred, r.nextInt(10000),
                        r.nextInt(100000))));
            }

        }
//        users.initUser(List.of(
//                new Human("Human1", false, 100, 30, 50000),
//                new Human("Human2", true, 100, 36, 40000),
//                new Human("Human3", false, 150, 25, 10000),
//                new Company("Company", false, 100000, 141),
//                new Company("Company", true, 40000, 545)
//        ));
        // выводим всех клиентов
        users.printUsers();
        // проходимся по всем клиентам и проверяем, кому можно выдать кредит на "случайную" сумму
        users.giveCredit();
        users.printUsers();
//        userView.creditPrint(users.getUser("Human1"),
    }
}
