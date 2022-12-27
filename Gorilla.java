public class Gorilla extends Mammal{

    public Gorilla(int energyLevel) {
        super(energyLevel);
    }
     public void throwSomething(){
         System.out.println("The gorilla has thrown something");
        int energy = getEnergyLevel() - 5;

        setEnergyLevel(energy);
     }

     public void eatBananas(){
         System.out.println("The gorilla has eaten a banana");
        int energy = getEnergyLevel() + 10;

        setEnergyLevel(energy);
     }

     public void climb(){
         System.out.println("The gorilla has climbed a tree");
        int energy = getEnergyLevel() - 10;

        setEnergyLevel(energy);
     }
}
