package designe_patterns.prototype;

public class Cookie implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() {
        Cookie copy = null;
        try {
            copy = (Cookie)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "name='" + name + '\'' +
                '}';
    }
}
