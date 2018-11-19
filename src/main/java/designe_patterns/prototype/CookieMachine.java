package designe_patterns.prototype;

public class CookieMachine {
    private Cookie cookie;

    public CookieMachine() {}

    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie makeCookie() {
        return (Cookie)cookie.clone();
    }

    @Override
    public String toString() {
        return "CookieMachine{" +
                "cookie=" + cookie +
                '}';
    }
}
