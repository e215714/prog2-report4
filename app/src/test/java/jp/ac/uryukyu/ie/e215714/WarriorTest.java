package jp.ac.uryukyu.ie.e215714;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        int attack = 100;
        int defaultSandbagHp = 10000;
        Warrior demoWarrior = new Warrior("デモ勇者", 100, attack);
        Enemy sandbag = new Enemy("サンドバッグくん", defaultSandbagHp, 100);
        for (int i=0; i<3; i++) {
            int beforeHp = sandbag.getHitPoint();
            demoWarrior.attackWithWeponSkill(sandbag);
            int diff = beforeHp - sandbag.getHitPoint();
            assertEquals((int)(attack*1.5), diff);
        }
    }
}
