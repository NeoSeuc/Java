package algorithms.paterns;

public class Singelton {
    private static Singelton instance = null;

    public static void main(String[] args) {
        Singelton obj = Singelton.getInstance();
        Singelton obj1 = Singelton.getInstance();
        Singelton obj2 = Singelton.getInstance();
    }

    private Singelton() { }

    public static Singelton getInstance() {
        if (instance ==  null) {
            System.out.println("Created new Singelton instance");
            instance = new Singelton();
        } else System.out.println("Invoked previously created instance");
        return instance;
    }
}
