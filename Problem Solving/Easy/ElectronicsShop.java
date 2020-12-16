class ElectronicsShop {
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxPrice = -1;
        int price = 0;
        
        for (int i: keyboards) {
            for (int j: drives) {
                price = i + j;
                
                if (price <= b && price > maxPrice) {
                    maxPrice = price;
                }
            }
        }
        
        return maxPrice;
    }
}