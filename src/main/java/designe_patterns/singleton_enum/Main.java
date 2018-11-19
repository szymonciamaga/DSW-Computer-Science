package designe_patterns.singleton_enum;

public class Main {
    public static void main(String[] args) {
        GameEngine en1 = GameEngine.INSTANCE;
        GameEngine en2 = GameEngine.INSTANCE;
        System.out.println(en1 == en2);
    }
}
