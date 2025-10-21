package Operator;

public class Number {
    //Method untuk mengeluarkan nilai A dan B
    public String getOperatorResults(int A, int B) {

        // Membuat program dengan operator aritmatika, relasi dan logika
        int sum = A + B;
        int product = A * B;
        boolean equal = (A == B);
        boolean and = (A > 0 && B > 0);
        boolean or = (A < 0 || B > 0);
        
        // Mengembalikan hasil dari berbagai operasi di atas
        return "Sum: " + sum + "\n" +
                "Product: " + product + "\n" +
                "Is Equal: " + equal + "\n" +
                "Logical AND: " + and + "\n" +
                "Logical OR: " + or;
    }
}
