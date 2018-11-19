package designe_patterns.singleton_enum;

public enum GameEngine {
    INSTANCE("Geralt");
    private int hp = 100;
    private String characterName;

    GameEngine(String characterName) {
        this.characterName = characterName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void run() {
        while (true) {
            //CZEKAMY NA INPUT GRACZA
            //ZMIANIAMY STAN GRY
            //RENDERUJEMY GRAFIKĘ
        }
    }
}
