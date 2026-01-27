public class ChildClassOne extends ParentClass{
    ChildClassOne(String name){
        super(name);
    }

    @Override
    void whoami(){
        System.out.println("I am Shammi");
    }
    @Override
    public String toString(){
        return this.name;
    }
}
