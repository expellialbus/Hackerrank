import java.util.*;

class SubArrayDivision {
	static int birthday(List<Integer> s, int d, int m) {
        int counter = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = i; j < m + i; j++) {
                sum += s.get(j);
            }

            if (sum == d) {
                counter++;
            }
        }

        return counter;
    }
}