public class Enemy extends GameObject{
    public Enemy(String name,int health,int damage){
        super(name,health,damage);
    }

    public void update(){
        System.out.println(name +" oyuncuya doğru yapay zeka ile ilerliyor.");
    }

    public void render(){
        System.out.println("Düşman modeli çiziliyor: "+ name);
    }
}