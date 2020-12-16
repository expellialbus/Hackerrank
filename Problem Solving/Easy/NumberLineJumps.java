class NumberLineJumps {
	static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 == x2) {
            return "YES";
        }

        long distanceOne = x1;
        long distanceTwo = x2;

        if (x1 > x2) {
            distanceOne = x2;
            distanceTwo = x1;
            int temp = v1;
            v1 = v2;
            v2 = temp;
        }

        long parse = distanceTwo - distanceOne;
        long distance = 0;

        while (parse > 0) {
            distanceTwo += v2;
            distanceOne += v1;

            distance = distanceTwo - distanceOne;

            if (distance == 0) {
                return "YES";
            } else if (distance < parse) {
                parse = distance;
            } else {
                return "NO";
            }
        }

        return "NO";

    }
}