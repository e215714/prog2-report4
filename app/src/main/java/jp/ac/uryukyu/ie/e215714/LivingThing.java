package jp.ac.uryukyu.ie.e215714;

/**
 * LivingThingクラス。
 *  String name; //LivingThingの名前
 *  int hitPoint; //LivingThingのHP
 *  int attack; //LivingThingの攻撃力
 *  boolean dead; //LivingThingの生死状態。true=死亡。
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name LivingThingの名前
     * @param maximumHP LivingThingのHP
     * @param attack LivingThingの攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * LivingThingへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(LivingThing opponent) {
        if (!dead) {
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    /**
     * 自身が死亡したかどうかのgetter．
     * @return 自身の生死状態
     */
    public boolean isDead() {
        return dead;
    }

    /**
     * 自身が死亡したかどうかのsetter．
     * @param d 設定したい自身の生死状態
     */
    public void setIsDead(boolean d) {
        this.dead = d;
    }

    /**
     * 自身の名前のgetter．
     * @return 自身の名前
     */
    public String getName() {
        return name;
    }

    /**
     * 自身のHPのgetter．
     * @return 自身のHP
     */
    public int getHitPoint() {
        return this.hitPoint;
    }

    /**
     * 自身のHPのsetter．
     * @param h 設定したいHP
     */
    public void setHitPoint(int h) {
        this.hitPoint = h;
    }

    public int getAttack() {
        return this.attack;
    }
}
