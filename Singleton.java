public class Singleton {

    // Step 1: Create a private static variable to hold the single instance
    private static Singleton instance;

    // Step 2: Make the constructor private so it can't be called from outside
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: Provide a public method to get the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

