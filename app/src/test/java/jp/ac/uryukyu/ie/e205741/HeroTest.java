package jp.ac.uryukyu.ie.e205741;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    @Test
    void attackWithWeponSkill() {
        int defaultWarriorAttack = 100;
        int wantattackWithWeponSkillDamage = (int)(defaultWarriorAttack * 1.5);
        Warrior demoWarrior = new Warrior("デモ勇者", 10, defaultWarriorAttack);
        Enemy slime = new Enemy("スライムもどき", 1000, 100);

        for (int i=0; i<3; i++){
            int beforeAttackEnemyHp = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            int afterAttackEnemyHp = slime.getHitPoint();
            assertEquals(wantattackWithWeponSkillDamage, beforeAttackEnemyHp - afterAttackEnemyHp);
        }
    }
}
