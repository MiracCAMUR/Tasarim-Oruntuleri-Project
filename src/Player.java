public class Player extends GameObject{
    public Player(String name,int health,int damage){
        super(name,health,damage);
    }

    public void update(){
        System.out.println(name +" klavyeden gelen girdilere göre hareket ediyor.");
    }

    public void render(){
        System.out.println("Oyuncu modeli çiziliyor: "+ name);
    }
}