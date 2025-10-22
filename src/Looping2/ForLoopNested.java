package Looping2;

public class ForLoopNested {
    // Metode untuk menerima nilai input bertipe int
    public String getGrid(int input) {
        String result = ""; // Membuat variabel result

        // Pengulangan bersarang untuk membuat pola teks sesuai test
        for (int row = 1; row <= input; row++) {
            for (int col = 1; col <= input; col++) {
                result += "Row " + row + " Col " + col;

                if (!(row == input && col == input)) {
                    result += "\n";
                }
            }

        }

        // Mengembalikan nilai result
        return result;
    }
}
