package core;

public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("Main Thread is started");

        new SecondThread().start();
        System.out.println("Main Thread is done");
    }
}

class SecondThread extends Thread {
    @Override
    public void run() {
        System.out.println("Second Thread is started");
        for (int i = 1; i <= 10; i++) {
            System.out.print((2*i)+" ");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("Second Thread is done");
    }
}
