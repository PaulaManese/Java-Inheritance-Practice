import java.awt.event.PaintEvent;

public class Toddler extends Person {

    String favoriteGame;

    Toddler(String name, String sex, int age, String favoriteGame){
        super(name, sex, age);
        this.favoriteGame = favoriteGame;
    }

    void drink() {
        System.out.println("Drinking Milk");
    }

    void checkStatus() {
        super.CheckStatus();
        System.out.println("Favorite Game : " + favoriteGame );
    }
}
