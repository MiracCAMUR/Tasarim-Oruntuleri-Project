public class Main{
    public static void main(String[] args){
        GameObject player=new GameObject("PLAYER", "Kahraman", 100, 20);
        GameObject enemy=new GameObject("ENEMY", "Zombi", 50, 10);
        GameObject item=new GameObject("ITEM", "Can İksiri", 0, 0);

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