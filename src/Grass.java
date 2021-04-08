public class Grass {
    double grassGrowth = 0.8;
    double grassHeightCurrent;
    double grassHeightLimit;

    public Grass() {}

    public Grass(double grassHeightCurrent, double grassHeightLimit) {
        this.grassHeightCurrent = grassHeightCurrent;
        this.grassHeightLimit = grassHeightLimit;
    }

    //Getter
    public double getGrassGrowth() {
        return grassGrowth;
    }

    public double getGrassHeightCurrent() {
        return grassHeightCurrent;
    }

    public double getGrassHeightLimit() {
        return grassHeightLimit;
    }

    //Setter
    public void setGrassGrowth(double grassGrowth) {
        this.grassGrowth = grassGrowth;
    }

    public void setGrassHeightCurrent(double grassHeightCurrent) {
        this.grassHeightCurrent = grassHeightCurrent;
    }

    public void setGrassHeightLimit(double grassHeightLimit) {
        this.grassHeightLimit = grassHeightLimit;
    }
}
