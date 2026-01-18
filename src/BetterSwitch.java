import java.util.Scanner;

public class BetterSwitch {
    void main(){
        // new way of writing switch statements
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day ");
        String day = scanner.nextLine();

        switch (day.toLowerCase()){
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println(day + " is a weekday");
            case "saturday", "sunday" -> System.out.println(day + " is a weekend");
            default -> System.out.println(day + " is not a day");
        }

    }
}
