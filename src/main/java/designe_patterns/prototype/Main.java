package designe_patterns.prototype;

public class Main {
    public static void main(String[] args) {
        Cookie tempCookie = null;
        Cookie prot = new ConcountCookie();
        prot.setName("Klaus");

        CookieMachine cm = new CookieMachine(prot);
        for (int i = 0; i < 100; i++) {
            tempCookie = cm.makeCookie();
            System.out.println(tempCookie);
        }
    }
}
