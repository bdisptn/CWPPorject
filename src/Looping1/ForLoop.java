package Looping1;

public class ForLoop {
    public int getNumbersAndSum(int input) {
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        return sum;
    }
}
