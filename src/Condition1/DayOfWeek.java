package Condition1;

public class DayOfWeek {
    // Metode untuk menerima nilai dayNumber bertipe int
    public String getDayName(int dayNumber) {
        // Membuat variabel untuk nama hari
        String dayName = "";

        // Switch-case untuk konversi dayNumber ke dayName
        switch (dayNumber) {
            case 1: 
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";   
                break;
            default:
                dayName = "Unknown";
                break;

        }

        return "Day: " + dayName;
    }
}
