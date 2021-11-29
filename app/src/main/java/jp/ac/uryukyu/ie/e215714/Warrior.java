package jp.ac.uryukyu.ie.e215714;

public class Warrior extends Hero{
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        var damage = (int)(attack*1.5);
        opponent.wounded(damage);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", name, opponent.getName(), damage);
    }
}
