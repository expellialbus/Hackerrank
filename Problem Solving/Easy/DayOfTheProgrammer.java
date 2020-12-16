class DayOfTheProgrammer {
	static String dayOfProgrammer(int year) {
        int[] calendar = {1, 2, 0, 9, year};

        if (year <= 1917) {
            if (year % 4 != 0) {
                calendar[1] = 3;
            }
        } else if (year >= 1919) {
            if (!((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
                calendar[1] = 3;
            }
        } else {
            calendar[0] = 2;
            calendar[1] = 6;
        }

        return createDate(calendar);
    }

    static String createDate(int[] arr) {
        String date = "";

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (j < 2) {
                date += Integer.toString(arr[i]);
            } else {
                date += ".";
                i--;
                j = -1;
            }
        }

        return date;
    }
}