import java.util.*;

class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int ltr = 0;
        int rtl = 0;

        for (int i = 0; i < arr.size();) {
            for (int j = 0; j < arr.size(); i++, j++) {
                ltr += arr.get(i).get(j);
                rtl += arr.get(i).get(arr.size() - j - 1);
            }
        }

        return (int)(Math.abs(ltr - rtl));
    }
}