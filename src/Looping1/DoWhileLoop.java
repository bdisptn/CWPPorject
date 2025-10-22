package Looping1;

public class DoWhileLoop {
    public int getOddNumbersAndSum(int input) {
        int i = 1;
        int sum = 0;

        if (input <= 0){
            return 0;
        }

        do {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;

        } while (i <= input);

        return sum;
    }
}
