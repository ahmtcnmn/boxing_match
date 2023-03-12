import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Fighter ahmet = new Fighter("Ahmet" , 15 , 100, 90, 10);
        Fighter can = new Fighter("Can" , 10 , 95, 100, 20);
        Match match1 = new Match(ahmet,can , 90 , 100);
        match1.run();
    }
}