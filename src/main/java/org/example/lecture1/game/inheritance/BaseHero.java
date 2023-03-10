package org.example.lecture1.game.inheritance;

import java.util.Random;

public class BaseHero {
    protected static int number;  // подсчет персонажей
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;

    static {        // статические поля
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero() {
        this(String.format("Hero_Priest #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200));
    }

    public void Healed(int Hp) { // метод лечения
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) { // метод получения урона
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
//        else { die(); }
    }

    public String getInfo() {
        return String.format("Name: %s Health: %d Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    // перегрузили метод атаки из кода каждого героя -> для общего использования для всех героев
    public void Attack(BaseHero target) {
        int damage = BaseHero.r.nextInt(10, 20);
        target.GetDamage(damage);
    }
}
