public class StaticTest {
    void main(){
        understandingStatic friend1 = new understandingStatic("Dime");
        System.out.println("First friend's name: "+ friend1.name);
        System.out.println("Friend count non-static: " + friend1.friendCountNonStatic);
        System.out.println("Friend count static: " + friend1.friendCount);

        understandingStatic friend2 = new understandingStatic("Vinne");
        System.out.println("Second friend's name: "+ friend2.name);
        System.out.println("Friend count non-static: " + friend2.friendCountNonStatic);
        System.out.println("Static Friend Count from first object: " + friend1.friendCount);
        System.out.println("Friend count from second object "+ friend2.friendCount);
    }
}
