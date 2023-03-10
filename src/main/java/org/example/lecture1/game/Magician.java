package org.example.lecture1.game;

import java.util.Random;

public class Magician {
    private static int number;
    private static Random r;

    private String name;
    private int hp; // health
    private int maxHp;

    private int mana;
    private int maxMana;

    static {
        Magician.number = 0;
        Magician.r = new Random();
    }

    public Magician(String name, int hp, int mana) {    // конструктор
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.mana = mana;
        this.maxMana = mana;
    }

    public Magician() {  // пустой конструктор
        this(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200),
                Magician.r.nextInt(50, 150));
    }

    public int Attack() {   // метод атаки
        int damage = Magician.r.nextInt(20, 30);
        this.mana -= (int) (damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public void Healed(int Hp){ // метод лечения
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) { // метод получения урона
        if (this.hp - damage > 0){
            this.hp -= damage;
        }
//        else { die(); }
    }

    public String getInfo() {
        return String.format("Name: %s Health: %d Energy: %d Type: %s",
                this.name, this.hp, this.mana, this.getClass().getSimpleName());
    }
}
