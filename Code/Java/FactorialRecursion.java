package Code.Java;

class FactorialRecursion {

    // Declare a static method else can't call the function without initialising the Class as an object
    private static Integer factorial(int number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number-1);
    }

    public static void main(String[] args) {
        Integer result = factorial(5);
        System.out.println(result.toString());
    }
}