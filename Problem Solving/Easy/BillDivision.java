import java.util.*;

class BillDivision {
	static void bonAppetit(List<Integer> bill, int k, int b) {
        int exact = sum(bill, k) / 2;
        
        if (exact == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - exact);
        }
    }
    
    static int sum(List<Integer> bill, int index) {
        int sum = 0;
        
        for (int i: bill) {
            sum += i;
        }
        
        return sum - bill.get(index);
    }
}