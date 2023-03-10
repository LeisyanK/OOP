package org.example.lecture1.robot;

public class Program1 {
    public static void main(String[] args) {
        // #region Robot1 demo

        Robot1 robot1 = new Robot1("name_1", 1);
        System.out.printf("%s %d\n", robot1.name, robot1.level);
        robot1.startBIOS();
        robot1.startOS();
        robot1.sayHi();

        robot1.work();
        robot1.work();
        robot1.work();

        robot1.sayBye();
        robot1.stopOS();
        robot1.stopBIOS();
    }
}
