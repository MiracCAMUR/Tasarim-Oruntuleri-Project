public class GameObjectFactory{
    
    public static GameObject C_Player(String Name, int Health, int Damage){
        GameObject obj=new Player(Name, Health, Damage);
        obj.setAttackBehavior(new AttackLightSaber()); 
        return obj;
    }

    public static GameObject C_ENEMY(String Name, int Health, int Damage){
        GameObject obj=new Enemy(Name, Health, Damage);
        obj.setAttackBehavior(new AttackBlaster()); 
        return obj;
    }

    public static GameObject C_Item(String Name){
        GameObject obj=new Item(Name,0,0);
        obj.setAttackBehavior(new NoAttack()); 
        return obj;
    }
}