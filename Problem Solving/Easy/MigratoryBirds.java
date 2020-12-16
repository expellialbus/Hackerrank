import java.util.*;

class MigratoryBirds {
	static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        
        for (Integer i: arr) {
            if (frequency.containsKey(i)) {
                frequency.put(i, (frequency.get(i) + 1));
            } else {
                frequency.put(i , 1);
            }
        }
        
        return findMax(frequency);
    }
 
    static int findMax(HashMap<Integer, Integer> map) {
        int key = 0;
        int maxValue = 0;
        
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > maxValue) {
                key = entry.getKey();
                maxValue = entry.getValue();
            } else if (entry.getValue() == maxValue) {
                if (entry.getKey() < key) {
                    key = entry.getKey();
                }
            }
        }
        
        return key;
    }
}