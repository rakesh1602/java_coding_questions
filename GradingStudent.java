import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudent {

    //grade a student from 1 to 100
    // grade < 40 = fail
    // if diff between grade - next multiple of 5 is less than 3, grade is next multiple of 5
    // if 3 and 4,5 is also not consider
    // if grade is 38, no rounding, still fails
    // return grades int[n]

    public static List<Integer> gradingStudent(List<Integer> grades) {
        List<Integer> updatedGrades = new ArrayList<>();
        for (int i : grades) {
            if (i < 38) {
                updatedGrades.add(i);
            } else {
                int nextMultipleOf5 = ((i / 5) + 1) * 5;
                if (nextMultipleOf5 - i < 3) {
                    updatedGrades.add(nextMultipleOf5);
                } else {
                    updatedGrades.add(i);
                }
            }
        }
        return updatedGrades;
    }
}
