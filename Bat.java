public class Bat extends Mammal{

    public Bat(int energyLevel) {
        super(energyLevel);
    }

    public void fly(){
        System.out.println("The bat is flying");
        int energy = getEnergyLevel() - 50;
        setEnergyLevel(energy);
    }

    public void eatHumans(){
        System.out.println("The bat has eaten a human");
        int energy = getEnergyLevel() + 25;
        setEnergyLevel(energy);
    }

    public void attackTown(){
        System.out.println("The bat attacked a town");
        int energy = getEnergyLevel() - 100;
        setEnergyLevel(energy);
    }
}
