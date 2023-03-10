package org.example.lecture1.robot;

public class Robot2 {
    /** Уровень робота */
    private int level;  // запретили получать и изменять значение переменной
    /** Имя робота */
    private String name;

    /** Создание робота
     * @param name Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     * */
    public Robot2(String name, int level)
    {
        this.name = name;
        this.level = level;
    }

    public void powerOn(){  // сделали "кнопку" для включения системы
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }
    public void powerOff(){ // сделали "кнопку" для выключения системы
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
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
        System.out.println("Working...");
    }
}
