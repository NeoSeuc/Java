package algorithms.paterns;

public class Singleton {
    private static Singleton instance = null;

    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
    }

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance ==  null) {
            System.out.println("Created new Singelton instance");
            instance = new Singleton();
        } else System.out.println("Invoked previously created instance");
        return instance;
    }
}
