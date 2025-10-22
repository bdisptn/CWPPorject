package Looping1;

public class DoWhileLoop {
    // Metode untuk menerima nilai input bertipe int
    public int getOddNumbersAndSum(int input) {
        // Membuat variabel yang dibutuhkan
        int i = 1; 
        int sum = 0;

        // Pemilihan agar output menjadi 0
        if (input <= 0){
            return 0;
        }

        // Pengulangan untuk membuat operasi penjumlahan bilangan ganjil
        do {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;

        } while (i <= input);

        // Mengembalikan nilai dari sum
        return sum;
    }
}
