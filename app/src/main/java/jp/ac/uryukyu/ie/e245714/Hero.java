package jp.ac.uryukyu.ie.e245714;

public class Hero extends LivingThing {
   
    public Hero(String _name,int _hitPoint,int _attack){
        super(_name,_hitPoint,_attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     * @Override
     */
    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("勇者は%sは道半ばで力尽きてしまった。。\n", getName());
        }
    }

}