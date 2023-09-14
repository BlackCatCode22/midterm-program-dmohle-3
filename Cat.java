public class Cat {
    String name;
    int age;
    int livesRemaining;

    String catSound;

    public Cat(String someName) {
        this.name = someName;
    }
    public Cat() {
        this.name = "Not Named";
    }

    // Give the cat a voice.
    public void meow() {
        System.out.println("\n Meow " + catSound);
    }

}
