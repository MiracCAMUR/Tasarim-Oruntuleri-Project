public class Item extends GameObject{
    public Item(String name,int health,int damage){
        super(name,health,damage);
    }

    public void update(){
        System.out.println(name +" yerde duruyor ve parlıyor.");
    }

    public void render(){
        System.out.println("Eşya ikonu çiziliyor: "+ name);
    }
}