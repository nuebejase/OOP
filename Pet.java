public abstract class Pet {
    protected String name;
    protected int happiness;
    protected int energy;
    protected int age;

    public Pet(String name) {
        this.name = name;
        this.happiness = 50;
        this.energy = 100;
        this.age = 1; 
    }

    public abstract void makeSound();

    public void feed() {
        energy += 25;
        if (energy > 100) energy = 100;
        System.out.println(name + " has been fed. Energy: " + energy);
    }

    public void play() {
        if (energy >= 20) {
            happiness += 15;
            energy -= 20;
            if (happiness > 100) happiness = 100;
            System.out.println(name + " played. Happiness: " + happiness + ", Energy: " + energy);
        } else {
            System.out.println(name + " is too tired to play.");
        }
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getEnergy() {
        return energy;
    }
}
