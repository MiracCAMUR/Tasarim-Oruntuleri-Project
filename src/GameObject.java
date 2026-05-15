import java.util.ArrayList;
import java.util.List;
public abstract class GameObject{
    public String name;
    public int health;
    public int damage;
    
    public AttackBehavior attackBehavior;
    private List<GameObserver> observers = new ArrayList<>();

    public GameObject(String name,int health,int damage){
        this.name=name;
        this.health=health;
        this.damage=damage;
    }

    public void setAttackBehavior(AttackBehavior attackBehavior){
        this.attackBehavior=attackBehavior;
    }

    public void addObserver(GameObserver observer){
        observers.add(observer);
    }

    public void notifyObservers(String message){
        for(GameObserver observer :observers){
            observer.onNotify(message);
        }
    }

    public void attack(){
        if(attackBehavior!=null){
            attackBehavior.perform(this.name,this.damage);
            
            notifyObservers(this.name +" bir saldırı hamlesi yaptı!"); 
        }else{
            System.out.println(name +" için bir saldırı yeteneği yok!");
        }
    }

    public abstract void update();
    public abstract void render();
}