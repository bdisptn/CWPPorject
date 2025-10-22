package Function2;

public class Factorial {
    // Metode untuk menghitung faktorial
    public int factorial(int n) {
        int result = 1;

        // Faktorial 0 didefinisikan sebagai 1
        if (n == 0) {
            return 1;
        }

        // Pengulangan untuk menurunkan dari n ke 1
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        // Mengembalikan nilai dari result
        return result;
    }
}
