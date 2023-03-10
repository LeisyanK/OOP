package org.example.lecture1.game.inheritance;

public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Priest.number),
                Priest.r.nextInt(100, 200));
        this.maxElixir = Priest.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    // этот метод перенесем в родительский класс BaseHero, чтобы использовать его перегрузку для всех героев
    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.elixir -= (int) (damage * 0.8);
        if (elixir < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s Elixir: %d", super.getInfo(), this.elixir);
    }
}
