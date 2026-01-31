import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        // Exception handling deals with try{} catch{}, finally{}

        int inputNumber;
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter your number: ");
            inputNumber=scanner.nextInt();
            System.out.println("Try "+inputNumber+"/0: "+ (inputNumber/0));
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
