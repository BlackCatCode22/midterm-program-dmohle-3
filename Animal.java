public class Animal {
    public static int numOfAnimals = 0;

    // Create a constructor
    public Animal() {
        numOfAnimals++;
    }

    String name;
    String birthSeason;
    String color;

    // Create a method
    public void makeNoise() {
        System.out.println("\n This is an animal object making noise...");
    }

    public String makeNoise02() {
        return "This is a str returned from a method ion my Animal class";
    }

}

