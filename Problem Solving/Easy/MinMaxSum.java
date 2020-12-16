import java.util.*;

class MinMaxSum {
	static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long result = 0L;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i] ;
        }

        System.out.println((result - arr[arr.length - 1]) + " " + ((result - arr[0])));
    }
}