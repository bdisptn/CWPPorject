package Operator;

public class Number {
    public String getOperatorResults(int A, int B) {
        int sum = A + B;
        int product = A * B;
        boolean equal = (A == B);
        boolean and = (A > 0 && B > 0);
        boolean or = (A < 0 || B > 0);
        
        return "Sum: " + sum + "\n" +
                "Product: " + product + "\n" +
                "Is Equal: " + equal + "\n" +
                "Logical AND: " + and + "\n" +
                "Logical OR: " + or;
    }
}
