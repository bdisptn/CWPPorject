package Looping2;

public class ForLoopNested {
    public String getGrid(int input) {
        String result = "";

        for (int row = 1; row <= input; row++) {
            for (int col = 1; col <= input; col++) {
                result += "Row " + row + " Col " + col;

                if (!(row == input && col == input)) {
                    result += "\n";
                }
            }

        }
        return result;
    }
}
