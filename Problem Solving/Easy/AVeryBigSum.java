class AVeryBigSum {
	static long aVeryBigSum(long[] ar) {
        long sum = 0L;

        for (long i: ar) {
            sum += i;
        }

        return sum;
    }
}