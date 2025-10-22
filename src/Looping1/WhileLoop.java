package Looping1;

public class WhileLoop {
    // Metode untuk menerima nilai input bertipe int
    public int getEvenNumbersAndSum(int input) {
        // Membuat variabel yang dibutuhkan
        int i = 1; 
        int sum = 0;

        //Pengulangan untuk membuat operasi penjumlahan bilangan genap
        while (i <= input) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        // Mengembalikan nilai dari sum
        return sum;
    }
}
