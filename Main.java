// Main.java
// Driver class for the Zoo program
// dH
// 9/26/23

public class Main {
    public static void main(String[] args) {

        // Call the static method to create a list of names
        Hyena.inputHyenaNames();

        // Show the hyena names:
        Hyena.listOut();

        System.out.println("\n Welcome to my Zoo!!");

        // Look at our animalNames file!
        // call inputHyenaNames()

        Hyena.inputHyenaNames();




        // Create a Hyena object.
        Hyena myNewHyena = new Hyena();

        System.out.println("\n Number of animals is " + myNewHyena.getNumOfAnimals() );
        System.out.println("\n Number of hyenas: " + myNewHyena.getNumOfHyenas());

        Hyena anotherHyena = new Hyena();

        System.out.println("\n Number of animals is " + myNewHyena.getNumOfAnimals() );
        System.out.println("\n Number of hyenas: " + anotherHyena.getNumOfHyenas());




        }
    }
