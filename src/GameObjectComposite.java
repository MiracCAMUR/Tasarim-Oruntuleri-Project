import java.util.ArrayList;
import java.util.List;
public class GameObjectComposite extends GameObject{
    private List<GameObject> list=new ArrayList<>();
   public GameObjectComposite(String name){
        super(name,0,0);
    }
    public void A_add(GameObject obj){
        list.add(obj);
    }
    public void A_remove(GameObject obj){
        list.remove(obj);
    }

    public void update(){
        System.out.println(this.name +" güncelleniyor.");
        for (GameObject obj :list) {
            obj.update();
        }
    }
    public void render(){
        System.out.println(this.name + " ekrana çiziliyor");
        for (GameObject obj:list){
            obj.render();
        }
    }
    public void attack(){
        System.out.println(this.name +" saldırıya geçti.");
        for (GameObject obj:list){
            obj.attack();
        }
    }
}