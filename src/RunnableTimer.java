public class RunnableTimer implements Runnable{

    @Override
    public void run() {

        System.out.println("Enter your name in 5 seconds");

        for(int i=5; i>=1; i--){
            //System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }

            if(i==1){
                System.out.println("Time's up");
                System.exit(0); /*this is used to kill both the threads
                                        otherwise the main thread would still be running
                                        even after this one ends*/
            }
        }
    }
}
