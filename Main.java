import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to my Cat Program!");

        // Create a cat object using the constructor with no arguments
        Cat myCat = new Cat();

        // Assign values to the cat object fields.
        myCat.age = 3;
       // myCat.name = "Felix";
        myCat.catSound = "GGGGG";
        // myCat.livesRemaining

        System.out.println(" My new cat's name is: " + myCat.name);
        myCat.meow();

        // Create an ArrayList of five cats
        ArrayList<Cat> catList = new ArrayList<>();

        // Use a for loop to create five Cat objects and add them to the ArrayList
        for (int i = 1; i <= 5; i++) {
            // using the constructor with arguments   Cat1, Cat2, etc.,
            Cat cat = new Cat("Cat" + i);
            catList.add(cat);
        }

        // Output the catList with an item in loop
        for (Cat cat : catList) {
            System.out.println(cat.name + " " + cat.age);
        }


    }

}
