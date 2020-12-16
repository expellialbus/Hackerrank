import java.util.*;

class GradingStudents {
	public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> values = new ArrayList<Integer>();
        int result = 0;

        for(Integer i : grades) {
            if (i < 38) {
                values.add(i);
            } else if ((result = (i % 5)) >= 3) {
                values.add(i + (5 - result));
            } else {
                values.add(i);
            }
        }
        
        return values;
    }
}