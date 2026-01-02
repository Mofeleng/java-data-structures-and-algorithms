package concepts;

public class Recursion {
    /*
    Recursion is when a thing is defined in terms of itself
    It is when you apply the result of a procedure to that same procedure until a base case is reached
    Recursive method is one that calls itself.
     */

    //Positive powers only
    private static int pow(int base, int power) {
        if (power < 1) return 1;
        return base * pow(base, power - 1);
    }
    private static int factorial(int n) {
        if (n < 1) return 1;
        return n * factorial(n-1);
    }
    private static void walk(int steps) {
        if (steps == 0) {
            System.out.println("done walking");
            return;
        }
        System.out.println("walking: " + steps + " left");
        walk(steps - 1);
    }
    public static void main(String[] args) {
        walk(5);
        System.out.println("The factorial of 5 is: " + factorial(5));
        System.out.println("10 to the power of 5 is: " + pow(10, 5));
    }
}
