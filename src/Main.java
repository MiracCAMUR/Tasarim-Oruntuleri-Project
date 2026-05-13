public class Main{
    public static void main(String[] args){
        GameObject player=GameObjectFactory.C_Player("Obi-Wan Kenobi",2000,170);
        GameObject enemy=GameObjectFactory.C_ENEMY("The Rancor",2500,190);
        GameObject item=GameObjectFactory.C_Item("Can iksiri");

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
        item.attack();
    }
}