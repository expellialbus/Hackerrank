class PlusMinus {
	static void plusMinus(int[] arr) {
        double plus = 0;
        double zeros = 0;
        double minus = 0;

        for (int i: arr) {
            if (i < 0) {
                minus++;
            } else if (i > 0) {
                plus++;
            } else {
                zeros++;
            }
        }

        System.out.println(plus / arr.length);
        System.out.println(minus / arr.length);
        System.out.println(zeros / arr.length);
    }
}