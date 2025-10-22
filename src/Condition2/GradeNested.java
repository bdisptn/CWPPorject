package Condition2;

public class GradeNested {
    public String getGradeInfo(String subject, int score) {
        String result = "";

        if (subject.equalsIgnoreCase("Math")) {
            if (score >= 90) {
                result = "Subject: Math, Grade: A";
            } else if (score >= 75) {
                result = "Subject: Math, Grade: B";
            } else if (score <= 74) {
                result = "Subject: Math, Grade: C";
            }

        } else if (subject.equalsIgnoreCase("English")) {
            if (score >= 85) {
                result = "Subject: English, Grade: A";
            } else if (score >= 70) {
                result = "Subject: English, Grade: B";
            } else if (score <= 69) {
                result = "Subject: English, Grade: C";
            }

        } else {
            result = "Subject: Unknown, Grade: N/A";
        
        }

        return result;
    }
}
