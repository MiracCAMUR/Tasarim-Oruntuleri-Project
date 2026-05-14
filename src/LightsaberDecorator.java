public class LightsaberDecorator extends GameObjectDecorator{
    public LightsaberDecorator(GameObject dec_Object){
        super(dec_Object);
    }

    public void attack(){
        dec_Object.attack();
        System.out.println(dec_Object.name +" ışın kılıcı ile +50 hasar verdi.");
        this.damage=dec_Object.damage+50; 
    }
}
