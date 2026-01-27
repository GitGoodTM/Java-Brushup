public class understandingStatic {

    String name;
    int friendCountNonStatic = 0;
    static int friendCount = 0;
    understandingStatic(String name){
        this.name=name;
        friendCountNonStatic++;
        friendCount++;
    }

}
