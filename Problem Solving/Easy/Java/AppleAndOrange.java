class AppleAndOrange {
	 static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int numberOfApple = 0;
        int numberOfOrange = 0;

        for (int apple: apples) {
            if (checkDistance(s, t, apple, a)) {
                numberOfApple++;
            }
        }

        for (int orange: oranges) {
            if (checkDistance(s, t, orange, b)) {
                numberOfOrange++;
            }
        }

        System.out.println(numberOfApple);
        System.out.println(numberOfOrange);
    }

    static boolean checkDistance(int s, int t, int fruitDistance, int tree) {
        int distance = tree + fruitDistance;

        if (distance >= s && distance <= t) {
            return true;
        } else {
            return false;
        }
    }
}