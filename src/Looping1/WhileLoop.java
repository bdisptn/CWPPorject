package Looping1;

public class WhileLoop {
    public int getEvenNumbersAndSum(int input) {
        int i = 1;
        int sum = 0;

        while (i <= input) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
}
