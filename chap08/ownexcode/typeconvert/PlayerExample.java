package chap08.ownexcode.typeconvert;

public class PlayerExample {


    public static void main(String[] args) {
        Player player = new Player();

        KartRider kartrider = new KartRider();
        FifaOnline4 fifaonline4 = new FifaOnline4();
        LOL lol = new LOL();

        player.start(kartrider);
        player.start(fifaonline4);
        player.start(lol);
    }
}
