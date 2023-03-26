package org.example.seminar5.cw.model;

public class Company extends User{
    private int inn;

    public Company(String name, boolean haveCredit, int balance, int inn) {
        super(name, haveCredit, balance);
        this.inn = inn;
    }

//    public Company(String name, int inn) {
//        super(name);
//        this.inn = inn;
//    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }
}
