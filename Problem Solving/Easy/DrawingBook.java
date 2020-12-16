class DrawingBook {
	static int pageCount(int n, int p) {
        int count = -1;
        
        if (isEnd(n, p)) {
            if (isEven(n)) {
                n = n + 1;
            }
            for (int i = n; i >= p; i -= 2) {
                count++;
            }
        } else {
            for (int i = 0; i <= p; i+= 2) {
                count++;
            }
        }
        
        return count;
    }
    
    static boolean isEnd(float n, int p) {
        if (n / 2 < p) {
            return true;
        } else {
            return false;
        }
    }
    
    static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}