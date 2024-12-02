package jp.ac.uryukyu.ie.e245714;

public class Warrior extends Hero{
    public Warrior(String _name,int _hitPoint,int _attack){
        super(_name,_hitPoint,_attack);
    }
    
    public void attackWithWeponSkill(LivingThing livingThing){
    
        int damage = (int)(getAttack() * 1.5);
        if (this.isDead()== false){
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n",getName(), livingThing.getName(), damage);
            livingThing.wounded(damage);
        }
        else{
            livingThing.wounded(0);
            
    
        }
    }


}
