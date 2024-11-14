public class Deer extends Pet {
    public Deer(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: *soft bleat*");
    }

    public void graze() {
        happiness += 5;
        if (happiness > 100) happiness = 100;
        System.out.println(name + " is grazing. Happiness: " + happiness);
    }
}
