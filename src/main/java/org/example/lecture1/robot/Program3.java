package org.example.lecture1.robot;

public class Program3 {
    public static void main(String[] args) {
        // #region Robot1 demo

        Robot3 robot3 = new Robot3("name_3");
        System.out.println("------------------");

        System.out.printf("%s %d\n", robot3.getName(), robot3.getLevel());
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();
        robot3.power();
    }
}
