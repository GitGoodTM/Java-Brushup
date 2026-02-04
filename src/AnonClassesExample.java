public class AnonClassesExample {
    public static void main(String[] args) {
        // Anonymous classes are those without any name, and cannot be reused
        // thus enabling us to add custom behavior without having to create a new class
        // Often used for one time uses (TimerTask, Runnable, callbacks)

        Cho2 cho2 = new Cho2();
        Cho2 sooraj = new Cho2(){
            @Override
            public void mech(){
                System.out.println("Cho2 does some electronics too");
            }
        };

        cho2.dev();
        cho2.mech();
        sooraj.mech();
    }
}
