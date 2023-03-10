package org.example.lecture1.robot;

public class Program2 {
    public static void main(String[] args) {
        // #region Robot1 demo

        Robot2 robot2 = new Robot2("name_2", 1);

        System.out.printf("%s %d\n", robot2.getName(), robot2.getLevel());
        robot2.powerOn();   // кнопка включения
        robot2.work();      // кнопка запуска каких-то действий
        robot2.powerOff();  // кнопка выключения
    }
}
