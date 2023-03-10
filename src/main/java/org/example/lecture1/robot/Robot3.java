package org.example.lecture1.robot;

import java.util.ArrayList;

public class Robot3 {

    enum State{
        On, Off
    }
    private static int defaultIndex;
    private static ArrayList<String> names;

    static {        // используем для создания роботов с разными именами
        defaultIndex = 1;
        names = new ArrayList<String>();    // имена роботов будут храниться здесь
    }

    /** Уровень робота */
    private int level;  // запретили получать и изменять значение переменной
    /** Имя робота */
    private String name;

    private State state;

    /** Создание робота
     * @param name Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     * */
    private Robot3(String name, int level)  // конструктор с двумя параметрами (со всеми возможными параметрами)
    {                       // чтобы поль-ль не смог выбрать(ввести) уровень, задаем private вместо public
                            // теперь польз-лю доступны только конструктор с одним пар-ром или пустой конструктор
        if( (name.isEmpty()     // имя, переданное пользователем, - пустое
           || Character.isDigit(name.charAt(0)))    // имя начинается с цифры
           || Robot3.names.indexOf(name) != -1) {   // такое имя робота уже есть в списке
            this.name = String.format("DefaultName_%d", defaultIndex++);
        }
        else {
            this.name = name;
        }

        Robot3.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }

    // коструктор с одним параметром, будет заменен ниже
//    public Robot3(String name){
//        if( (name.isEmpty()     // имя, переданное пользователем, - пустое
//                || Character.isDigit(name.charAt(0)))    // имя начинается с цифры
//                || Robot3.names.indexOf(name) == -1) {   // такое имя робота уже есть в списке
//            this.name = String.format("DefaultName_%d", defaultIndex++);
//        }
//        else {
//            this.name = name;
//        }
//
//        Robot3.names.add(this.name);
//        this.level = 1;
//        this.state = State.Off;
//    }
    // конструктор без параметров, будет заменен ниже
//    public Robot3(){
//        this.name = String.format("DefaultName_%d", defaultIndex++);
//
//        Robot3.names.add(this.name);
//        this.level = 1;
//        this.state = State.Off;
//    }

    public Robot3(String name){ // конструктор с одним параметром вызывает конструктор с двумя пар-рами,
        this(name, 1);      // передав имя name и уровень = 1
    }
    public Robot3(){    // конструктор без параметров вызывает конструктор с одним пар-ром,
        this(""); // передав в него пустое имя
    }
    private void powerOn(){  // сделали "кнопку" для включения системы
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }
    private void powerOff(){ // сделали "кнопку" для выключения системы
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }
    public void  power(){   // польз-лю оставили одну кнопку для вкл/выкл состояния робота
        if (this.state == State.Off) {
            this.powerOn();
            this.state = State.On;
        }
        else {
            this.powerOff();
            this.state = State.Off;
        }
    }
    public int getLevel(){  // метод на чтение значения переменной
        return this.level;
    }

    public String getName(){
        return this.name;
    }

    // методы вкл/выкл подсистем
    /**Загрузка BIOS*/
    private void startBIOS(){
        System.out.println("Start BIOS...");
    }   // public заменили на private, чтобы закрыть доступ к методу извне

    /**Загрузка OS*/
    private void startOS(){
        System.out.println("Start OS...");
    }

    /**Приветствие*/
    private void sayHi(){
        System.out.println("Hello, world...");
    }

    /**Выгрузка BIOS*/
    private void stopBIOS(){
        System.out.println("Stop BIOS...");
    }

    /**Выгрузка OS*/
    private void stopOS(){
        System.out.println("Stop OS...");
    }

    /**Прощание*/
    private void sayBye(){
        System.out.println("Bye...");
    }

    /**Работа*/
    public void work(){
        if (this.state == State.On) {
            System.out.println("Working...");
        }
    }
}
