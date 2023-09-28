// Main.java
// Driver class for the Zoo program
// dH
// 9/26/23

// updated 9/28


public class Main {

    // Creating the genUniqueID method
    private static String genUniqueID(String theSpecies, int numOfSpecies) {
        String prefix = "";
        int suffix = numOfSpecies + 1;


        if (theSpecies.contains("hyena")) {
            prefix = "Hy";
        }

        return prefix + Integer.valueOf(suffix);

    }



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

        // how many hyenas
        int currentNumOfHyenas = Hyena.getNumOfHyenas();

        System.out.println("\n The number of hyenas is: " + currentNumOfHyenas + "\n\n");

        Hyena oneMore = new Hyena();

        oneMore.setAnimalID("Hy09");

        oneMore.setAnimalColor("yellow spots");

        System.out.println("\n My hyena is " + oneMore.getAnimalColor());

        System.out.println("\n The id of oneMore is " + oneMore.getAnimalID());

        // Create an id for our new animal

        String theNewID = genUniqueID("hyena",8);

        System.out.println(" the new id is: " + theNewID);

        }
    }
