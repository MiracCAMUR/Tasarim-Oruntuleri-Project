public class AttackBlaster implements AttackBehavior{
    public void perform(String name,int damage){
        System.out.println(name +" blaster ile "+ damage +" hasar verdi.");
    }
}