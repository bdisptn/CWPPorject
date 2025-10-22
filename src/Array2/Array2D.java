package Array2;

public class Array2D {
    // Metode untuk menerima nilai-nilai dari matrix bertipe int array array
    public String getMatrixInfo(int[][] matrix) {
        // Membuat variabel yang dibutuhkan  
        int total = 0; 
        int count = 0;
        String result = "";

        // Pengulangan untuk membuat baris
        for (int i = 0; i < matrix.length; i++) {
            result += "Row " + (i + 1) + ": ";
            
            // Pengulangan untuk membuat kolom
            for (int j = 0; j < matrix[i].length; j++) {
                int value = matrix[i][j];
                total += value;
                count++;

                // Pemilihan untuk menambahkan label E/O
                if (value % 2 == 0) {
                    result += value + "E ";
                } else {
                    result += value + "O ";
                }
            }

            result += "\n";
        }

        // Menghitung rata-rata
        double average = (double) total / count;

        // Output
        result += "Total: " + total + "\n";
        result += "Average: " + average;

        // Mengembalikan nilai dari result
        return result;
    }
}
