import java.util.*;

class BirthdayCakeCandles {
	public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles, new Comparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return -1 * (first.compareTo(second));
            }
        });
        
        int frequency = 0;

        for (int candle: candles) {
            if (candle < candles.get(0)) {
                break;
            } else {
                frequency++;
            }
        }
        
        return frequency;
    }
}