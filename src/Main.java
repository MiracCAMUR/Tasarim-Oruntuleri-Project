public class Main{
    public static void main(String[] args){
        GameObject player=GameObjectFactory.C_Player("Obi-Wan Kenobi",2000,170);
        GameObject enemy=GameObjectFactory.C_ENEMY("Jango Fett",1900,150);
        GameObject item=GameObjectFactory.C_Item("Can iksiri");
        GameObject A_1=GameObjectFactory.C_ENEMY("Droid 1", 80, 20);
        GameObject A_2=GameObjectFactory.C_ENEMY("Droid 2", 80, 20);
        GameObject A_3=GameObjectFactory.C_ENEMY("Süper Droid", 200, 80);
        GameObjectComposite droidArmy=new GameObjectComposite("DROİD ORDUSU");
        droidArmy.A_add(A_1);
        droidArmy.A_add(A_2);
        droidArmy.A_add(A_3);
        player = new LightsaberDecorator(player);
        System.out.println(" OYUN BAŞLIYOR ");
        
        player.update();
        enemy.update();
        item.update();
        
        System.out.println("\n ÇİZİM AŞAMASI ");
        player.render();
        enemy.render();
        item.render();

        System.out.println("\n SAVAŞ ");
        player.attack();
        enemy.attack();
        droidArmy.attack();
        item.attack();
    }
}