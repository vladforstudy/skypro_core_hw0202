public class Hogwarts {
    private String name;
    private int witchcraftPower;
    private int transgression;

    public Hogwarts(String name, int witchcraftPower, int transgression) {
        this.name = name;
        this.witchcraftPower = witchcraftPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getWitchcraftPower() {
        return witchcraftPower;
    }

    public void setWitchcraftPower(int witchcraftPower) {
        this.witchcraftPower = witchcraftPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "; witchcraftPower: " + witchcraftPower +
                "; transgression: " + transgression;
    }
}
