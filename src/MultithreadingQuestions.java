/*
*  MULTITHREADING QUESTIONS
* */

/* Print numbers from 1 to 30 in order, odd numbers and even numbers should be
*  printed in two different threads
 */
public class MultithreadingQuestions {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->
        {
            for (int i = 1; i <=29 ; i=i+2) {
                System.out.println(i);
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(() ->
        {
            for (int i = 2; i <=30 ; i=i+2) {
                System.out.println(i);
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        Thread.sleep(1);
        t2.start();
    }
}
