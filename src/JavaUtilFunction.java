import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaUtilFunction {
    static void main(String[] args) {
        /*
        There are 4 main in-built Functional Interfaces with java.util.function
         */

        // 1. Predicate: used to test a given condition; accepts a value and returns a boolean as result
        Predicate<String> isHumanPredicate = (isCho2Human) -> isCho2Human.equalsIgnoreCase("Cho2 is Human");
        System.out.println(isHumanPredicate.test("Cho2 is Human"));
        System.out.println(isHumanPredicate.test("Cho2 is Alien"));

        // 2. Function: takes one input and returns some output as per the logic
        // Both the input and return types need to be declared during initialization
        Function<String, String> isHumanFunction = (isCho2Human) -> {
            if(isCho2Human.equalsIgnoreCase("Is Cho2 Human?"))
                return "Yes";
            else
                return "No";
        };
        System.out.println(isHumanFunction.apply("Is Cho2 Human?"));
        System.out.println(isHumanFunction.apply("Is Cho2 Alien?"));

        // 3. Consumer: it takes one input but returns nothing
        Consumer<String> stringConsumer = (String actualName) -> System.out.println("Cho2's actual name is "+actualName);
        stringConsumer.accept("Sooraj");

        // 4. Supplier: it does not take any input but returns a value, mainly used when there is requirement to generate or supply data
        Supplier<String> stringSupplier = () -> "Supplier is working";
        System.out.println(stringSupplier.get());
        Supplier<Double> integerSupplier = () -> Math.random();
        System.out.println(integerSupplier.get());
    }
}
