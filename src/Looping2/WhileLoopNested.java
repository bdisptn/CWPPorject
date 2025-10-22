package Looping2;

public class WhileLoopNested {
    // Metode untuk menerima nilai input bertipe int
    public String getTriangle(int input) {
        // Membuat variabel yang dibutuhkan
        String result = ""; 
        int row = 1;

        // Pengulangan bersarang untuk membuat pola bintang sesuai test
        while (row <= input) {
            int col = 1;
            while (col <= row) {
                result += "*";
                col++;
            }

            if (row < input) {
                result += "\n";
            }

            row++;
        }

        // Mengembalikan nilai result
        return result;
    }
}
