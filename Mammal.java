public class Mammal {

    private int energyLevel = 100;

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int displayEnergy(){
        System.out.println("Energy level: " + energyLevel);

        return energyLevel;
    }
}
