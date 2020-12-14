package jp.ac.uryukyu.ie.e205741;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

     /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
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
    public boolean isDead(){
        return this.dead;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }
    public void setDead(boolean dead){
        this.dead = dead;
    }



    public void attack(LivingThing opponent){
        if(hitPoint > 0){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
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


