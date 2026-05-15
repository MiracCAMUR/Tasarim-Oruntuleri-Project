public class NoAttack implements AttackBehavior{
    public void perform(String name,int damage){
        System.out.println("Eşyalar saldıramaz.");
    }
}