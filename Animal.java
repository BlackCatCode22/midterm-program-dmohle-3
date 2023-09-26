public class Animal {
    private static int numOfAnimals = 0;

    // Create a getter.
    // What type of method is this? Is it static and belongs to a class or...
    // is this method used with objects.

    public int getNumOfAnimals() {
        return numOfAnimals;
    }


    // Constructor
    public Animal() {
        System.out.println("\n A new animal was created!");
        numOfAnimals++;
    }



}
