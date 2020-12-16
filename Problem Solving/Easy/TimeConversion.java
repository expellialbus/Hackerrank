import java.util.*;

class TimeConversion {
	static String timeConversion(String s) {
        List<Integer> numbers = sparse(s);

        return (s.charAt(8) == 'P') ? typePm(numbers) : typeAm(numbers);
    }

    static List<Integer> sparse(String s) {
        List<Integer> numbers = new ArrayList<Integer>();
        int[] indices = {0, 1, 3, 4, 6, 7};

        for (int i = 0; i < indices.length; i++) {
            numbers.add(Integer.parseInt(Character.toString(s.charAt(indices[i]))));
        }

        return numbers;
    }
    
    static String merge(List<Integer> numbers) {
        String s = "";

        for (int i = 0, j = 0; i < numbers.size(); i++, j++) {
            if (j < 2) {
                s += Integer.toString(numbers.get(i));
            } else {
                s += ":";
                i--;
                j = -1;
            }
        }

        return s;
    }

    static String typePm(List<Integer> numbers) {
        if (numbers.get(0) == 1 && numbers.get(1) == 2) {
            return merge(numbers);
        } else {
            numbers.set(0, numbers.get(0) + 1);
            numbers.set(1, numbers.get(1) + 2);

            return merge(numbers); 
        }
    }

    static String typeAm(List<Integer> numbers) {
        if (numbers.get(0) == 1 && numbers.get(1) == 2) {
            numbers.set(0, 0);
            numbers.set(1, 0);

            return merge(numbers);
        } else {
            return merge(numbers);
        }
    }
}