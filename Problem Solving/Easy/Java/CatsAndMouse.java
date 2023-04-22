class CatsAndMouse {
	static String catAndMouse(int x, int y, int z) {
        int distanceCatA = Math.abs(z - x);
        int distanceCatB = Math.abs(z - y);
        
        if (distanceCatA == distanceCatB) {
            return "Mouse C";
        } else if (distanceCatA > distanceCatB) {
            return "Cat B";
        } else {
            return "Cat A";
        }
    }
}