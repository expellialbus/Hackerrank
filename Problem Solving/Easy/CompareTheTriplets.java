import java.util.*;

class CompareTheTriplets {
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> points = new ArrayList<Integer>();
        points.add(0);
        points.add(0);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                points.set(0, (points.get(0) + 1));
            } else if (a.get(i) < b.get(i)) {
                points.set(1, (points.get(1) + 1));
            }
        }

        return points;
    }
}