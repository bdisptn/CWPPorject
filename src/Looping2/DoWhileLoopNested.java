package Looping2;

public class DoWhileLoopNested {
    // Metode untuk menerima nilai input bertipe int
    public String getNumberTriangle(int input) {
        String result = "";
        int row = 1;

        // Jika input 0 atau negatif, maka hasilnya kosong
        if (input <= 0) {
            return result;
        }

        // Pengulangan bersarang untuk membuat pola baris bilangan asli sesuai test
        do {
            int col = 1;
            do {
                result += col;
                col++;
            } while (col <= row);

            if (row < input) {
                result += "\n";
            }

            row++;
        } while (row <= input);

        // Mengembalikan nilai dari result
        return result;
    }
}
