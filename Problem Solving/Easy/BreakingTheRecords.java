class BreakingTheRecords {
	static int[] breakingRecords(int[] scores) {
        int highCount = 0;
        int lowCount = 0;

        int high = scores[0];
        int low = scores[0];

        for (int i: scores) {
            if (i > high) {
                highCount++;
                high = i;
            } else if (i < low) {
                lowCount++;
                low = i;
            }
        }

        int[] records = {highCount, lowCount}; 

        return records;
    }
}
