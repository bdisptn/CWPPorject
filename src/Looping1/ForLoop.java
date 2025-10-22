package Looping1;

public class ForLoop {
    // Metode untuk menerima nilai input bertipe int
    public int getNumbersAndSum(int input) {
        int sum = 0; // Membuat variabel sum

        // Pengulangan untuk membuat operasi penjumlahan bilangan asli
        for (int i = 1; i <= input; i++) {
            sum += i;
        }

        // Mengembalikan nilai dari sum
        return sum;
    }
}
