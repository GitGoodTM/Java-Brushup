import java.util.Scanner;

public class ThreadingExample {
    public static void main(String[] args) {
        /*
        * Threading allows a program to run multiple tasks simultaneously
        * Helps to improve performance with time-consuming operations
        * (File I/O. network communications or any background tasks)*/

        // We can create a thread in two ways:
        // Option 1: Extend the Thread class (simpler but limited due to single inheritance)
        // Option 2: Implement the Runnable interface (better)

        // We'll have an extra thread here
        // The point to note is that both the threads run simultaneously

        Scanner scanner = new Scanner(System.in);
        RunnableTimer runnableTimer = new RunnableTimer();
        Thread thread = new Thread(runnableTimer);
        thread.setDaemon(true); // this enables the secondary thread to be killed when the main thread has been completed
        thread.start();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi "+name);

        scanner.close();
    }
}
