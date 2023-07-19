package StaticAnahtarSozcugu;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Mustafa Çetindağ", 1);
        p1.login();

        Player p2 = new Player("Kodluyoruz", 1);
        p2.login();

        System.out.println(Player.count);
    }
}
