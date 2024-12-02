package jp.ac.uryukyu.ie.e245714;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String _name,int _hitPoint,int _attack){
        this.name = _name;
        this.hitPoint = _hitPoint;
        this.attack = _attack;
    }

    public boolean isDead(){
        return this.dead;
    }

    public String getName(){
        return this.name;
    }

    public int getHitPoint(){
        return this.hitPoint;
    }

    public int getAttack(){
        return this.attack;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public void setDead(boolean dead){
        this.dead = dead;
    }

    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        if (this.dead == false){
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
        else{
            opponent.wounded(0);
        }

    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}
