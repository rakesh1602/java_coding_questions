public class TestSingleton {
    public static void main(String[] args) {
        // Get the single instance of Singleton
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // Check if both references point to the same object
        System.out.println(s1 == s2); // true (same instance)
    }
}
