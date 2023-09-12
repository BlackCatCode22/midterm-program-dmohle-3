/* JavaMidtermSpr23.java
 * dH 3/9/23
 *
 * open arrivingAnimals
 * read into a 1-D array
 * process line by line to specified output
 *
 * Sample Input from arrivingAnimals.txt:
 *   4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
 *
 * Sample Output line:
 *   Hy01; Kamari; 4 years old; birth date Mar 21, 2018; tan color; female; 70 pounds; from Friguia Park, Tunisia;
 *   arrived March 10, 2023
 *
 * References:
 *   https://www.w3schools.com/java/java_user_input.asp
 *   https://www.w3schools.com/java/java_files.asp
 *   https://www.w3schools.com/java/java_arrays.asp
 *   https://www.w3schools.com/java/java_ref_string.asp
 *   https://www.geeksforgeeks.org/different-ways-for-integer-to-string-conversions-in-java/
 *   https://www.w3schools.com/java/java_date.asp
 *   https://www.quickprogrammingtips.com/java/how-to-calculate-age-from-date-of-birth-in-java.html
 *
 *
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.io.BufferedWriter;
import java.io.FileWriter;

import java.util.ArrayList;

public class SampleZoo {
    static String calcBirthdate(int yearsOld, String birthSeason) {

        int year = 2023 - yearsOld;
        String monthDay;
        String newDate;

        switch (birthSeason) {
            case "spring,":
                monthDay = "03-21";
                break;
            case "summer,":
                monthDay = "06-21";
                break;
            case "fall,":
                monthDay = "09-21";
                break;
            case "winter,":
                monthDay = "12-21";
                break;
            default:
                monthDay = "01-01";
                break;
        }
        newDate =  Integer.toString(year) + "-" + monthDay;

        return newDate;
    }

    static String genUniqueID(String speciesName, int numOfSpecies) {
        String uniqueID;

        switch (speciesName) {
            case "hyena":
                uniqueID = "Hy0" + Integer.toString(numOfSpecies);
                break;
            case "lion":
                uniqueID = "Li0" +  Integer.toString(numOfSpecies);
                break;
            case "tiger":
                uniqueID = "Ti0" +  Integer.toString(numOfSpecies);
                break;
            case "bear":
                uniqueID = "Be0" +  Integer.toString(numOfSpecies);
                break;
            default:
                uniqueID = "error";
                break;
        }
        return uniqueID;
    }


    public static void main(String[] args) {
        System.out.println("\n\nWelcome to Dennis's Zoo program!\n\n");

        // Create an animal
        Animal myAnimal = new Animal();

        myAnimal.name = "Banzai";

        // create a new student
        Student myNewStudent = new Student();

        // Create three students
        Student student01 = new Student();
        Student student02 = new Student();
        Student student03 = new Student();

        // Give the stdents names...
        student01.name = "Manny";
        student02.name = "Moe";
        student03.name = "Jack";

        // Create an ArrayList of Students
        ArrayList<Student> students = new ArrayList<>();

        students.add(student01);
        students.add(student02);
        students.add(student03);

        // Output the student names
        for (Student student : students) {
            System.out.println("Student name is: " + student.name);
        }

        System.out.println();


        myNewStudent.name = "First Last";
        System.out.println("\n The new student's name is: " + myNewStudent.name);


        System.out.println("\n Animal name is " + myAnimal.name);



        // Global variables used for species populations
        int numOfHyenas = 0;
        int numOfLions = 0;
        int numOfTigers = 0;
        int numOfBears = 0;

        // Arrays used for output.
        // We want our output to look like the sampleOutput.txt file which has the species grouped together.
        // We will use ArrayList for our final programs, but for this program we use regular-old arrays that
        // have a fixed size and cannot have elements added to or subtracted from.
        // We have four animals of each species, therefore, we create four arrays of four elements.
        String hyenas[] = new String[4];
        hyenas[0] = "the first hyena";
        System.out.println("hyenas[0] is: " + hyenas[0]);
        String lions[] = new String[4];
        lions[0] = "the first lion";
        System.out.println("lions[0] is: " + lions[0]);
        String tigers[] = new String[4];;
        String bears[] = new String[4];;

        // In a sentence, what we do in this program is -- Read the file, line by line and then process
        // each line, according to program design specifications, into output.

        // Create a String array with 16 elements.
        // the elements will be initialized to a null string
        String arrivingAnimals[] = new String[16];

        // Use Scanner class to open the arrivingAnimals.txt file. This is the file we use for input.
        // Pro tip: use BufferedReader instead of Scanner
        // You must use try/catch blocks when doing file io.
        try {
            File myAnimalsFile = new File("C:\\Users\\BE218\\zooFiles\\arrivingAnimals.txt");
            Scanner scanner = new Scanner(myAnimalsFile);
            System.out.println("\n The arrivingAnimals.txt file...\n");

            // lineNum will be used in the while() loop to iterate through the array
            int lineNum = 0;

            // The Scanner object (named "scanner") has 16 lines of text right now.
            // We want to get this text into an array so we can manipulate the data to our design specifications.
            // The Loop Control Variable is the hasNextLine() method of our scanner object.
            while (scanner.hasNextLine()) {
                // Read a line from scanner into a string object named "line"
                String line = scanner.nextLine();
                // Assign this line of text to our arrivingAnimals[] array
                // Note how lineNum is used as the index (element number) of the arrivingAnimals array.
                arrivingAnimals[lineNum] = line;
                // Increment lineNum because we are going to the next array element.
                lineNum++;
                // Output each line so we can see what we are doing.
                // The string variable "line" contains the text in our scanner object at this moment in our program.
                System.out.println(line);
            }
            // If you open a file, you must close it. Our scanner object has a method named close()
            // that does this for us!
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("\n A file error occured...");
            e.printStackTrace();
        }

        // Output the array.
        System.out.println("\n The array...\n");
        for (String line:arrivingAnimals) {
            System.out.println(line);
        }
        // Reminder, this is what we are doing. We are processing input into output.
        // Input: 4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        // Output:  Hy01; Kamari; 4 years old; birth date Mar 21, 2018; tan color; female; 70 pounds;
        //   from Friguia Park, Tunisia; arrived March 10, 2022

        // Variables needed for string processing.
        int position = 0;

        // Variables needed to process the array.
        int years = 0;
        String season;
        String sex;
        String species;
        String birthdate;
        String color;
        String origin;
        String weight;
        String name;
        String uniqueID = "xyz";
        String arrived;

        // You must name your new animal friend.
        // Quickest way to do this is to create four 1-D string arrays with names.
        // Bonus points if your program opened the file named "animalNames.txt" to create these arrays!
        String hyenaNames[] = {"Shenzi", "Banzai", "Ed", "Zig", "Bud", "Lou", "Kamari", "Wema", "Nne", "Madoa", "Prince Nevarah"};
        String lionNames[] = {"Scar", "Mufasa", "Simba", "Kiara", "King", "Drooper", "Kimba", "Nala", "Leo", "Samson", "Elsa", "Cecil"};
        String bearNames[] = {"Yogi", "Smokey", "Paddington", "Lippy", "Bungle", "Baloo", "Rupert", "Winnie the Pooh", "Snuggles", "Bert"};
        String tigerNames[] = {"Tony", "Tigger", "Amber", "Cosimia", "Cuddles", "Dave", "Jiba", "Rajah", "Rayas", "Ryker"};

        // We have sixteen lines in the arrivingAnimals[] array.
        // We will loop through the array 16 times, from element 0 to element 15
        // Examine the following for() loop and discover how it works.
        for (int i = 0; i < 16; i++) {

            // Split the string into words.
            // Note the index (element number) of our arrivingAnimals[] array -- it is "i" our loop control variable!
            // A single element in the arrivingAnimals[] array is a String object, and a String object has a handy
            // method named "split()" that will create an array of strings based on the input we give to split()
            // Here you see the input to split() is two arguments. The first argument tells split what to split on,
            // the second argument is called the limit and this tells split how many splits to create. We use 0 here so
            // we will create as many splits as our string has. The string that we are splitting will have 16 to 20
            // words if we split on spaces.
            // We create an array of Strings to collect our newly split words.
            String splitStr[] = arrivingAnimals[i].split(" ", 0);

            // Output the split.
            // This is a shortcut in Java that allows you to use a for loop and use "this in that" notation.
            // Here we will loop thru the String array named splitStr[] until we find all of the array elements.
            // Nice, right?!
            // Examine the output here and you will see something like this. Note how we can use some of this
            // information without processing it to get (data) about our animals
            // splitStr[0] = 4    (age)
            // splitStr[1] = year
            // splitStr[2] = old
            // splitStr[3] = male (sex)
            // splitStr[4] = bear, (species)
            // splitStr[5] = born
            // splitStr[6] = in
            // splitStr[7] = spring, (birth season)
            // splitStr[8] = brown   (color)
            // splitStr[9] = color,
            // splitStr[10] = 405    (weight)
            // splitStr[11] = pounds,
            // splitStr[12] = from
            // splitStr[13] = Alaska  (origin)
            // splitStr[14] = Zoo,
            // splitStr[15] = Alaska

            // Take a moment and observe this output and think about what an array is and what the splitStr[] array holds.
            for (String s : splitStr) {
                System.out.println(s);
            }

            // We use two elements from our split to calculate a birthday - years (an int) and season (a String)
            // Calculate birthday using years old and birth season
            birthdate = calcBirthdate(Integer.parseInt(splitStr[0]), splitStr[7]);
            System.out.println("birthDate is: " + birthdate);

            // Find incoming animal sex.
            sex = splitStr[3];
            System.out.println("sex is: " + sex);

            // Find incoming animal species.
            species = splitStr[4];
            System.out.println("species is: " + species);

            // Delete the trailing comma.
            position = species.indexOf(",");
            System.out.println("position of comma is: " + position);

            // substring() arguments: beginning index, ending index-1
            species = species.substring(0, position);
            System.out.println("species is now: " + species);

            // Now that we know the species, we update the global variable corresponding to the species
            // (we will solve this global variable issue when we code this program up with classes and lists after midterm)
            // This is also a good place to generate a unique ID because after we have updated the number of animals in
            // a species, we have one of the arguments needed for the genUniqueID() method!
            if (species.equals("hyena")) {
                numOfHyenas++;
                uniqueID = genUniqueID(species, numOfHyenas);
            } else if (species.equals("lion")) {
                numOfLions++;
                uniqueID = genUniqueID(species, numOfLions);
            } else if (species.equals("tiger")) {
                numOfTigers++;
                uniqueID = genUniqueID(species, numOfTigers);
            } else if (species.equals("bear")) {
                numOfBears++;
                uniqueID = genUniqueID(species, numOfBears);
            } else {
                System.out.println("Error tabulating number of species");
            }

            // Let's take a look at the numbers and... uniqueID
            System.out.println("numOfHyenas = " + numOfHyenas);
            System.out.println("numOfLions = " + numOfLions);
            System.out.println("numOfTigers = " + numOfTigers);
            System.out.println("numOfBears = " + numOfBears);

            System.out.println("uniqueID = " + uniqueID);

            // Find color
            // We can't use the index from splitStr() because the color of each arriving animal could have different
            //   number of words.
            // so... we split() on the commas, and find the color that way!
            // make sure to use the same index (8 for our tiger with a long color)
            String splitStrComma[] = arrivingAnimals[i].split(",", 0);

            // Output the split
            for (String s : splitStrComma) {
                System.out.println(s);
            }
            // Notice what we got from this split...
            //
            // splitStrComma[0] = 4 year old male bear
            // splitStrComma[1] = born in spring
            // splitStrComma[2] = brown color
            // splitStrComma[3] = 405 pounds
            // splitStrComma[4] = from Alaska Zoo
            // splitStrComma[5] = Alaska
            //
            // After examining the output of this split on comma, we see that color is element 2
            color = splitStrComma[2];
            System.out.println("color = " + color);

            // get weight and origin this way and then we are almost done!
            weight = splitStrComma[3];

            // origin is actually two element, but that is not a problem for us...
            origin = splitStrComma[4] + "," + splitStrComma[5];

            System.out.println("weight = " + weight);
            System.out.println("origin = " + origin);


            // Use uniqueID to get a name!
            String uniqueIDPrefix = uniqueID.substring(0, 2);
            System.out.println("uniqueIDPrefix = " + uniqueIDPrefix);
            String uniqueIDSuffix = uniqueID.substring(2);
            System.out.println("uniqueIDSuffix = " + uniqueIDSuffix);
            int suffixAsInt = Integer.parseInt(uniqueIDSuffix);
            System.out.println("suffixAsInt = " + suffixAsInt);
            // Now that we have information from the unique ID as a species indicator and the number of animals of
            // a species, we can get a name that has not been used.

            // Use a switch statement because java is string-switch friendly!
            switch (uniqueIDPrefix) {
                case "Hy":
                    name = hyenaNames[suffixAsInt];
                    break;
                case "Li":
                    name = lionNames[suffixAsInt];
                    break;
                case "Ti":
                    name = tigerNames[suffixAsInt];
                    break;
                case "Be":
                    name = bearNames[suffixAsInt];
                    break;
                default:
                    name = "error in name switch statement";
                    break;
            }

            System.out.println("name is: " + name);

            // Almost done....
            // use system date for arrival and to calculate animal's age in years
            String arrivalDate;

            // Create a variable of type LocalDate so we can use it to our advantage later...
            LocalDate curDate = LocalDate.now();
            arrivalDate = curDate.toString();
            System.out.println("arrivalDate: " + arrivalDate);
            LocalDate bDate = LocalDate.parse(birthdate);

            // Age is easy with the LocalDate class, but birthdate and arrivalDate must be in same format (YEAR-MM-DD)
            // This is where the LocalDate stuff pays off.
            int animalAge = Period.between(bDate, curDate).getYears();
            System.out.println(" Age is: " + animalAge);

            // Now... I think we have everything. Check sample output to get everything in the right order.
            String outputLine;
            outputLine = uniqueID + "; " +
                    name + "; " +
                    animalAge + " years old" + "; " +
                    "birth date " + birthdate + ";" +
                    color + "; " +
                    sex + ";" +
                    weight + ";" +
                    origin + ";" +
                    " arrived " + arrivalDate;

            System.out.println("\n\n" + outputLine + "\n\n");

            // We created four species arrays to make creating our output file easier.
            // Get this animal into its species array
            if (species.equals("hyena")) {
                hyenas[numOfHyenas-1] = outputLine;
            } else if (species.equals("lion")) {
                lions[numOfLions-1] = outputLine;
            } else if (species.equals("tiger")) {
                tigers[numOfTigers-1] = outputLine;
            } else if (species.equals("bear"))  {
                bears[numOfBears-1] = outputLine;
            }
        }

        // Output the four arrays. This should be close to our final output.

        System.out.println("\nHyena Habitat:\n");
        for (int i=0; i<4; i++) {
            System.out.println(hyenas[i]);
        }
        System.out.println("\nLion Habitat:\n");
        for (int i=0; i<4; i++) {
            System.out.println(lions[i]);
        }
        System.out.println("\nTiger Habitat:\n");
        for (int i=0; i<4; i++) {
            System.out.println(tigers[i]);
        }
        System.out.println("\nBear Habitat:\n");
        for (int i=0; i<4; i++) {
            System.out.println(bears[i]);
        }

        // Write to an external file using BufferedWriter
        try {
            // Create a FileWriter
            FileWriter file = new FileWriter("C:\\Users\\BE218\\zooFiles\\javaOutputFile.txt");
            // Create a BufferedWriter
            BufferedWriter output = new BufferedWriter(file);

            // Replace the System.out.println() statements with output.write()
            output.write("Hyena Habitat:\n\n");
            for (int i = 0; i < 4; i++) {
                output.write(hyenas[i]+"\n");
            }
            output.write("\nLion Habitat:\n\n");
            for (int i = 0; i < 4; i++) {
                output.write(lions[i]+"\n");
            }
            output.write("\nTiger Habitat:\n\n");
            for (int i = 0; i < 4; i++) {
                output.write(tigers[i]+"\n");
            }
            output.write("\nBear Habitat:\n\n");
            for (int i = 0; i < 4; i++) {
                output.write(bears[i]+"\n");
            }
            // If you open a file, you must close it
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }

    }
}