package designe_patterns.strategy;

import designe_patterns.strategy.chief.Chief;
import designe_patterns.strategy.chief.egg_cooker.HardBoildedEggCooker;

public class Main {
    public static void main(String[] args) {
        Chief chief = new Chief("Magdalena Gesler");
        chief.setEggCooker(new HardBoildedEggCooker());
        chief.cook();
    }
}
