import java.util.Scanner;

public class Engine {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String name;
    private String type;
    private Scanner scanner =new Scanner(System.in);
    Engine(String engineType){
        this.type=engineType;
        if (engineType.equalsIgnoreCase("V6")){
            this.name="Busso";
        }else {
            System.out.print("Enter engine name: ");
            this.name=scanner.nextLine();
        }

    }
}
