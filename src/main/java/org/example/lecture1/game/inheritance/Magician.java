package org.example.lecture1.game.inheritance;

public class Magician extends BaseHero {
    private int mana;
    private int maxMana;

    public Magician() {  // здесь будут доступны все параметры BaseHero, помеченные модификаторами public или protected

        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxMana = Magician.r.nextInt(50, 150);  // доинициализация манов
        this.mana = maxMana;
    }

    // этот метод перенесем в родительский класс BaseHero, чтобы использовать его перегрузку для всех героев
    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.mana -= (int) (damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    }
}
