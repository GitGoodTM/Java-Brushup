public class GrandChildClass extends ChildClassOne{
    GrandChildClass(String name) {
        super(name);
        System.out.println("Constructor"+name);
    }

    public static void main(String[] args){
        ChildClassOne child1 = new ChildClassOne("Kaviraj");
        System.out.println("Grandparent name: "+child1.name);

        child1.whoami();
        System.out.println(child1);
    }
}
