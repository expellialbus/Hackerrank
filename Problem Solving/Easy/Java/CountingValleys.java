import java.util.*;

class CountingValleys {
	public static int countingValleys(int steps, String path) {
        Stack<Character> stack = new Stack<Character>();
        int valleys = 0;
        int seaLevel = 0;
        
        for (int i = 0; i < steps; i++) {
            if (stack.isEmpty()) {
                stack.push(path.charAt(i));
                
                if (stack.peek() == 'U') {
                    seaLevel++;
                } else {
                    seaLevel--;
                }
                
                if (seaLevel < 0) {
                    valleys++;
                }
            } else {                
                if (stack.peek() != path.charAt(i)) {
                    stack.pop();
                    
                    if (path.charAt(i) == 'U') {
                        seaLevel++;
                    } else {
                        seaLevel--;
                    }
                } else {
                    stack.push(path.charAt(i));
                    
                    if (path.charAt(i) == 'U') {
                        seaLevel++;
                    } else {
                        seaLevel--;
                    }
                }
            }
        }
        
        return valleys;
    }
}