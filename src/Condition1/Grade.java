package Condition1;

public class Grade {
    // Metode untuk menerima nilai score bertipe int 
    public String getGrade(int score) {
        // Membuat variabel grade
        String grade; 

        // Pemilihan konversi score menjadi grade
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 75) {
            grade = "B";
        } else if (score >= 60) {
            grade = "C";
        } else {
            grade = "F";
        } 

        // Mengembalikan nilai dari grade
        return "Grade: " + grade;    
    }
}
