public class GameObject{
    public String type;
    public String name;
    public int health;
    public int damage;

    public GameObject(String type,String name,int health,int damage){
        this.type=type;
        this.name=name;
        this.health=health;
        this.damage=damage;
    }
    public void update(){
        if(type.equals("PLAYER")){
            System.out.println(name +" klavyeden gelen girdilere göre hareket ediyor.");
        }else if(type.equals("ENEMY")){
            System.out.println(name +" oyuncuya doğru yapay zeka ile ilerliyor.");
        }else if(type.equals("ITEM")){
            System.out.println(name +" yerde duruyor ve parlıyor.");
        }else {
            System.out.println("Bilinmeyen nesne tipi!");
        }
    }
    public void attack(){
        if(type.equals("PLAYER")){
            System.out.println(name +" ışın kılıcı ile "+ damage +" hasar verdi!");
        }else if(type.equals("ENEMY")){
            System.out.println(name + " blaster ile "+ damage +" hasar verdi!");
        }else if(type.equals("ITEM")){
            System.out.println("Eşyalar saldıramaz!");
        }
    }
    public void render(){
        if(type.equals("PLAYER")){
            System.out.println("Oyuncu modeli çiziliyor: "+ name);
        }else if(type.equals("ENEMY")){
            System.out.println("Düşman modeli çiziliyor: "+ name);
        }else if(type.equals("ITEM")){
            System.out.println("Eşya ikonu çiziliyor: "+ name);
        }
    }
}
    

