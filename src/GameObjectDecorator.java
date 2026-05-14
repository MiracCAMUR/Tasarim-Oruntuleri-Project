public abstract class GameObjectDecorator extends GameObject{
    protected GameObject dec_Object;
    public GameObjectDecorator(GameObject dec_Object){
        super(dec_Object.type, dec_Object.name, dec_Object.health, dec_Object.damage);
        this.dec_Object = dec_Object;
    }
    public void update() {
        dec_Object.update();
    }

    public void render() {
        dec_Object.render();
    }

    public void attack() {
        dec_Object.attack();
    }
}
