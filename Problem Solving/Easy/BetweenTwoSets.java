import java.util.*;

class BetweenTwoSets {
	public static int getTotalX(List<Integer> a, List<Integer> b) {
        sort(a);
        sort(b);
        
        List<Integer> factors = findFactors(a.get(a.size() - 1), b.get(0), a);     
        
        checkCorrects(factors, b);
        
        return factors.size();
    }
    
    static void sort(List<Integer> list) {
        list.sort(
            new Comparator<Integer>() {
                @Override 
                public int compare(Integer first, Integer second) {
                    return first.compareTo(second);
                }
            }
        );
    }
    static List<Integer> findFactors(int start, int stop, List<Integer> list) {
        List<Integer> factors = new ArrayList<Integer>();
        boolean flag = true;
        
        for (int i = start; i <= stop; i++) {
            flag = true;
            for (int j: list) {
                if (i >= j) {
                    if (i % j != 0) {
                        flag = false;
                        break;
                    }
                } else {
                    if (j % i != 0) {
                        flag = false;
                        break;
                    }
                }
            }
            
            if (flag) {
                factors.add(i);
            }
        }
        
        return factors;
    }
    
    static void checkCorrects(List<Integer> factors, List<Integer> list) {
        List<Integer> copy = new ArrayList<Integer>(factors);
        
        for (int i: copy) {
            for (int j: list) {
                if (i >= j) {
                    if (i % j != 0) {
                        factors.remove(new Integer(i));
                    }
                } else {
                    if (j % i != 0) {
                        factors.remove(new Integer(i));
                    }
                }
            }
        }
    }
}