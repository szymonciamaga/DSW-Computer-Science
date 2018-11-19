package designe_patterns.strategy.chief;

import designe_patterns.strategy.chief.egg_cooker.EggCooker;

public class Chief {
    private String name;
    private EggCooker eggCooker;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EggCooker getEggCooker() {
        return eggCooker;
    }

    public void setEggCooker(EggCooker eggCooker) {
        this.eggCooker = eggCooker;
    }

    public Chief(String name) {
        this.name = name;
    }

    public void cook() {
        this.eggCooker.cookEgg();
    }

    public Chief(String name, EggCooker eggCooker) {
        this.name = name;
        this.eggCooker = eggCooker;
    }
}
