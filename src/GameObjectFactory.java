public class GameObjectFactory {
    
    public static GameObject C_Player(String Name,int Health,int Damage){
            return new GameObject("PLAYER",Name,Health,Damage);
    }
    public static GameObject C_ENEMY(String Name,int Health,int Damage){
            return new GameObject("ENEMY",Name,Health,Damage);
    }
    public static GameObject C_Item(String Name){
            return new GameObject("ITEM",Name,0,0);
    }
}
