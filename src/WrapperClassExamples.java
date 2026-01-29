public class WrapperClassExamples {
    public static void main(String[] args) {
        // Wrapper classes allow primitive values like int, char, double etc to be used as objects
        // don't use it unless you need an object
        // enables some utility methods

        Integer a = Integer.parseInt("123");
        Double d = Double.parseDouble("3.14");
        String s = a.toString();
    }
}
