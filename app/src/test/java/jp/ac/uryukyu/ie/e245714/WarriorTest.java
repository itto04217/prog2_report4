package jp.ac.uryukyu.ie.e245714;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class WarriorTest {
    @Test
    void warriortest(){
        ;
        Warrior warrior = new Warrior("勇者",30,4);
        Enemy enemy= new Enemy("敵",30,4);
        for(int i=0;i>3;i++){
           int beforeHitPoint =  enemy.getHitPoint();
           warrior.attackWithWeponSkill(enemy);
           int afterHitPoint = enemy.getHitPoint();
           assertEquals(warrior.getAttack() * 1.5,beforeHitPoint - afterHitPoint);
        }  
    }
}
 