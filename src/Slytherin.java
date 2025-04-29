public class Slytherin extends Hogwarts {
    private int trick;
    private int decision;
    private int ambition;
    private int ingenuity;
    private int powerThirst;

    public Slytherin(String name, int witchcraftPower, int transgression, int trick, int decision,
                     int ambition, int ingenuity, int powerThirst) {
        super(name, witchcraftPower, transgression);
        this.trick = trick;
        this.decision = decision;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.powerThirst = powerThirst;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDecision() {
        return decision;
    }

    public void setDecision(int decision) {
        this.decision = decision;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getPowerThirst() {
        return powerThirst;
    }

    public void setPowerThirst(int powerThirst) {
        this.powerThirst = powerThirst;
    }

    @Override
    public String toString() {
        return "trick: " + trick +
                "; decision: " + decision +
                "; ambition: " + ambition +
                "; ingenuity: " + ingenuity +
                "; powerThirst: " + powerThirst;
    }
}
