public class understandingStatic {

    String name;
    int friendCountNonStatic = 0;
    static int friendCount = 0;
    static String whoami;

    understandingStatic(String name){
        this.name=name;
        friendCountNonStatic++;
        friendCount++;
    }

    static {
        whoami="friend";
        System.out.println("In static block, executes even before constructor");
    }
}
