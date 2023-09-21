// dH 9/19/23
// Main.java
// Driver class for zooWarmUp

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    // Create the genUniqueIDFunction

    // values for theSpecies:
    //   lion
    String genUniqueID(String theSpecies ) {
        if (theSpecies.equals("lion")) {
            // do something
        }
        return "the name";
    }


    public static void main(String[] args) {

        System.out.println("Welcome to my Zoo Program!");

        // How many animals do we have.
        System.out.println("\n Before we use 'new' ... we have " + Animal.numOfAnimals + " animals!");

        // Create an animal object.
        Animal myNewAnimal = new Animal();

        myNewAnimal.name = "Leo";

        System.out.println("\n the name of the new animal is: " + myNewAnimal.name);

        // Create a hyena.
        Hyena myHyena = new Hyena();

        Hyena myHyena02 = new Hyena();
        Hyena myHyena03 = new Hyena();

        // How many hyenas do we have?
        System.out.println("We have " + Hyena.numOfHyenas + " hyenas!");


        // Give the new hyena a name...
        myHyena.name = "Zig";

        System.out.println("\n My new hyena is named: " + myHyena.name);

        myHyena.makeNoise();

        // How many animals do we have now.
        System.out.println("\n After using new twice we have " + Animal.numOfAnimals + " animals!");



        System.out.println("He makes this noise: " + myHyena.makeNoise02());



        // open the arriving animal text file
        // Define the file path


     /*
        String filePath = "C:\\Users\\BE218\\IdeaProjects\\zooWarmUp\\files\\arrivingAnimals.txt";

        String theSpecies = "";



        // Create an ArrayList to hold the animal objects!
        ArrayList<Animal> animalList = new ArrayList<>();

        try {
            // Create a FileReader to read the file
            FileReader fileReader = new FileReader(filePath);

            // Create a BufferedReader to efficiently read lines
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;



            // Read and print each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                // System.out.println(line);
                // Split the line into 6 substring
                String[] myArray = line.split(",");


                // Create an Animal object from the Animal class.
                Animal anyOldAnimal = new Animal();

                // Increment the static Animal count
                Animal.numOfAnimals++;


                // fill the object's data fields
                anyOldAnimal.desc = myArray[0];
                anyOldAnimal.birthSeason = myArray[1];
                anyOldAnimal.color = myArray[2];
                anyOldAnimal.weight = myArray[3];
                anyOldAnimal.origin01 = myArray[4];
                anyOldAnimal.origin02 = myArray[5];

                // Add the newly created animal object to the array list
                animalList.add(anyOldAnimal);

            }

            // Close the BufferedReader and FileReader
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("An error occurred while reading the file.");
        }

        // We are done with the text file.
        // Output the ArrayList!
        // Output the catList with an item in loop
        for (Animal animal : animalList) {
            System.out.println(animal.desc);
            // Get the species

            System.out.println(animal.birthSeason);
            System.out.println(animal.color);
            System.out.println(animal.weight);
            System.out.println(animal.origin01);
            System.out.println(animal.origin02);
            System.out.println("\n\n");
        }

        System.out.println(" The number of animals is: " + Animal.numOfAnimals);
*/


    }
}




