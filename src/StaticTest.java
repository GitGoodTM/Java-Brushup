public class StaticTest {
    void main(){
        understandingStatic friend1 = new understandingStatic("Dime");
        System.out.println("First friend's name: "+ friend1.name);
        System.out.println("Friend count non-static: " + friend1.friendCountNonStatic);
        System.out.println("Friend count static: " + friend1.friendCount);

        understandingStatic friend2 = new understandingStatic("Vinne");
        System.out.println("Second friend's name: "+ friend1.name);
        System.out.println("Friend count non-static: " + friend1.friendCountNonStatic);
        System.out.println("Friend count static: " + friend1.friendCount);
    }
}
