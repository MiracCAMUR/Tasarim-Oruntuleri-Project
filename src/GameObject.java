public abstract class GameObject{
    public String name;
    public int health;
    public int damage;
    
    public AttackBehavior attackBehavior;

    public GameObject(String name, int health, int damage){
        this.name=name;
        this.health=health;
        this.damage=damage;
    }

    public void setAttackBehavior(AttackBehavior attackBehavior){
        this.attackBehavior=attackBehavior;
    }

    public void attack(){
        if (attackBehavior!=null) {
            attackBehavior.perform(this.name,this.damage);
        }else{
            System.out.println(name +" için bir saldırı yeteneği yok!");
        }
    }

    public abstract void update();
    public abstract void render();
}