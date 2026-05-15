public class GameManager implements GameObserver{
    public void onNotify(String message){
        System.out.println("OYUN YÖNETİCİSİ: "+ message);
    }
}