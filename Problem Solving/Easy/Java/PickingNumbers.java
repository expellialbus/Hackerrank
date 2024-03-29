import java.util.*;

class PickingNumbers { 
    public static void addNumber(List<Integer> list, int number) {
        for (int i: list) {
            if (Math.abs(i - number) > 1) {
                return;
            } 
        }
        
        list.add(number);
    }

    public static int pickingNumbers(List<Integer> a) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> temp;
        
        for (int i: a) {
            temp = new ArrayList<Integer>();
            
            for (int j: a) {
                if (Math.abs(j - i) <= 1) {
                    addNumber(temp, j);
                }
            }
            
            if (temp.size() > arr.size()) {
                arr = new ArrayList<Integer>(temp);
            }
        }
        
        return arr.size();
    }
}