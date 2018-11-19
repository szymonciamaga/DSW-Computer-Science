package designe_patterns.singleton;

import java.io.Serializable;

public class GameEngine implements Serializable {
    private static final long serialVersionUID = 22546545;
    private String name;
    private static GameEngine instance = new GameEngine("Geralt");

    private GameEngine(String name) {
        this.name = name;
    }

    public static GameEngine getInstance() {
        return instance;
    }

    public void run() {
        while (true) {
            //CZEKAMY NA INPUT GRACZA
            //ZMIANIAMY STAN GRY
            //RENDERUJEMY GRAFIKĘ
        }
    }

    protected Object readResolve() {
        return getInstance();
    }

    @Override
    public String toString() {
        return "GameEngine{" +
                "name='" + name +
                '}';
    }
}
