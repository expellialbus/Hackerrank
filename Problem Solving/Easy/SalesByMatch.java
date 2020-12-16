import java.util.*;

class SalesByMatch {
	static int sockMerchant(int n, int[] ar) {
        ArrayList<Integer> indices = new ArrayList<Integer>();
        
        for (int i = 0; i < ar.length - 1; i++) {
            boolean flag = true;
            
            for (Integer k: indices) {
                if (i == k) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                for (int j = i + 1; j < ar.length; j++) {
                    boolean localFlag = true;
                    
                    for (Integer k: indices) {
                        if (j == k) {
                            localFlag = false;
                            break;
                        }
                    }
                    
                    if (localFlag) {
                        if (ar[i] == ar[j]) {
                            indices.add(i);
                            indices.add(j);
                            
                            break;
                        }
                    }
                }
            }
        }
        
        return indices.size() / 2;
    }
}