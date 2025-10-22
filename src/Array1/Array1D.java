package Array1;

public class Array1D {
    // Metode untuk menerima nilai-nilai dari numbers bertipe int array
    public String getArrayInfo(int[] numbers) {
        String result = ""; // Membuat variabel yang dibutuhkan
        int sum = 0;

        // Pengulangan untuk membuat output numbers dan hasil penjumlahannya sesuai test
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
            sum += numbers[i];
            if (i < numbers.length - 1) {
                result += " ";
            }
        }

        // Output
        result += "\nSum: " + sum;
        // Mengembalikan nilai dari result
        return result;
    }
}
